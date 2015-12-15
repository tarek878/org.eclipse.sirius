/*******************************************************************************
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.sirius.ui.properties.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.eclipse.eef.EEFViewDescription;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.EEFPage;
import org.eclipse.eef.core.api.EEFView;
import org.eclipse.eef.core.api.EEFViewFactory;
import org.eclipse.eef.ide.ui.internal.properties.EEFTabDescriptor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.business.api.query.EObjectQuery;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.common.interpreter.api.VariableManagerFactory;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.sirius.properties.ViewExtensionDescription;
import org.eclipse.sirius.viewpoint.description.Group;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.ITabDescriptor;
import org.eclipse.ui.views.properties.tabbed.ITabDescriptorProvider;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

public class SiriusTabDescriptorProvider implements ITabDescriptorProvider {

    @Override
    public ITabDescriptor[] getTabDescriptors(IWorkbenchPart part, ISelection selection) {
        if (selection instanceof IStructuredSelection) {
            IStructuredSelection structuredSelection = (IStructuredSelection) selection;
            Object[] objects = structuredSelection.toArray();
            // FIXME We take the first one
            if (objects.length > 0) {
                EObject semanticElement = SemanticElementFinder.getAssociatedSemanticElement(objects[0]);
                if (semanticElement != null) {
                    // Let's find out the description of the view
                    return this.getTabDescriptors(semanticElement);
                }
            }
        }
        return new ITabDescriptor[0];
    }

    private ITabDescriptor[] getTabDescriptors(EObject semanticElement) {
        Session session = new EObjectQuery(semanticElement).getSession();
        List<ViewExtensionDescription> descriptions = findActiveDescriptions(session, semanticElement);
        // FIXME We take only the firts one
        if (descriptions.size() > 0) {
            ViewExtensionDescription viewExtensionDescription = descriptions.get(0);
            return getTabDescriptors(session, semanticElement, viewExtensionDescription);
        }
        return new ITabDescriptor[0];
    }

    private ITabDescriptor[] getTabDescriptors(Session session, EObject semanticElement, ViewExtensionDescription viewExtensionDescription) {
        EEFViewDescription viewDescription = new ViewDescriptionConverter(viewExtensionDescription).convert();
        EEFView eefView = createEEFView(session, semanticElement, viewDescription);
        
        List<ITabDescriptor> descriptors = new ArrayList<ITabDescriptor>();
        List<EEFPage> eefPages = eefView.getPages();
        for (EEFPage eefPage : eefPages) {
            descriptors.add(new EEFTabDescriptor(eefPage));
        }
        return descriptors.toArray(new ITabDescriptor[descriptors.size()]);
    }

    private EEFView createEEFView(Session session, EObject semanticElement, EEFViewDescription viewDescription) {
        IVariableManager variableManager = new VariableManagerFactory().createVariableManager();
        variableManager.put(EEFExpressionUtils.SELF, semanticElement);
        EEFView eefView = new EEFViewFactory().createEEFView(viewDescription, variableManager, new SiriusInterpreter(session), session.getTransactionalEditingDomain(), semanticElement);
        return eefView;
    }

    private List<ViewExtensionDescription> findActiveDescriptions(Session session, EObject semanticElement) {
        List<ViewExtensionDescription> descriptions = new ArrayList<ViewExtensionDescription>();
        if (session != null) {
            Set<Resource> activeVSMs = Sets.newLinkedHashSet();
            for (Viewpoint viewpoint : session.getSelectedViewpoints(true)) {
                Resource vsm = viewpoint.eResource();
                if (vsm != null) {
                    activeVSMs.add(vsm);
                }
            }

            List<ViewExtensionDescription> result = Lists.newArrayList();
            for (Resource vsm : activeVSMs) {
                Group group = (Group) vsm.getContents().get(0);
                Iterables.addAll(result, Iterables.filter(group.getExtensions(), ViewExtensionDescription.class));
            }
            return result;
        }
        return descriptions;
    }
}