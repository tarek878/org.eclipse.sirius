/*******************************************************************************
 * Copyright (c) 2008, 2016 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.sirius.business.internal.metamodel.description.spec;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.viewpoint.DView;
import org.eclipse.sirius.viewpoint.MetaModelExtension;
import org.eclipse.sirius.viewpoint.SiriusPlugin;
import org.eclipse.sirius.viewpoint.ViewpointFactory;
import org.eclipse.sirius.viewpoint.description.impl.MetamodelExtensionSettingImpl;

/**
 * Implementation of MetamodelExtensionSettingImpl.java.
 * 
 * @author cbrun.
 */
public class MetamodelExtensionSettingSpec extends MetamodelExtensionSettingImpl {

    /**
     * {@inheritDoc}
     * 
     * @see org.eclipse.sirius.description.impl.SiriusOperationImpl#updateAnalysis(org.eclipse.sirius.viewpoint.DView)
     */
    public void updateAnalysis(final DView analysis) {
        if (getExtensionGroup() != null && SiriusPlugin.getDefault().getModelAccessorRegistry().getModelAccessor(analysis).eInstanceOf(getExtensionGroup(), "ExtensionGroup")) { //$NON-NLS-1$
            final EObject group = getExtensionGroup();
            final MetaModelExtension extension = ViewpointFactory.eINSTANCE.createMetaModelExtension();
            extension.setExtensionGroup(group);
            analysis.setOwnedExtensions(extension);
        }
    }
}
