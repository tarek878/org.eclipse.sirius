/*******************************************************************************
 * Copyright (c) 2007, 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.sirius.editor.properties.sections.description.semanticbaseddecoration;

// Start of user code imports

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.sirius.editor.editorPlugin.SiriusEditor;
import org.eclipse.sirius.editor.properties.sections.common.AbstractTextPropertySection;
import org.eclipse.sirius.editor.tools.api.assist.TypeContentProposalProvider;
import org.eclipse.sirius.viewpoint.description.DescriptionPackage;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

// End of user code imports

/**
 * A section for the domainClass property of a SemanticBasedDecoration object.
 */
public class SemanticBasedDecorationDomainClassPropertySection extends AbstractTextPropertySection {

    /**
     * @see org.eclipse.sirius.editor.properties.sections.AbstractTextPropertySection#getDefaultLabelText()
     */
    protected String getDefaultLabelText() {
        return "DomainClass"; //$NON-NLS-1$
    }

    /**
     * @see org.eclipse.sirius.editor.properties.sections.AbstractTextPropertySection#getLabelText()
     */
    protected String getLabelText() {
        String labelText;
        labelText = super.getLabelText() + "*:"; //$NON-NLS-1$
        // Start of user code get label text

        // End of user code get label text
        return labelText;
    }

    /**
     * @see org.eclipse.sirius.editor.properties.sections.AbstractTextPropertySection#getFeature()
     */
    public EAttribute getFeature() {
        return DescriptionPackage.eINSTANCE.getSemanticBasedDecoration_DomainClass();
    }

    /**
     * @see org.eclipse.sirius.editor.properties.sections.AbstractTextPropertySection#getFeatureValue(String)
     */
    protected Object getFeatureValue(String newText) {
        return newText;
    }

    /**
     * @see org.eclipse.sirius.editor.properties.sections.AbstractTextPropertySection#isEqual(String)
     */
    protected boolean isEqual(String newText) {
        return getFeatureAsText().equals(newText);
    }

    /**
     * {@inheritDoc}
     */
    public void createControls(Composite parent, TabbedPropertySheetPage tabbedPropertySheetPage) {
        super.createControls(parent, tabbedPropertySheetPage);
        /*
         * We set the color as it's a TypeName
         */
        text.setBackground(SiriusEditor.getColorRegistry().get("green"));

        nameLabel.setFont(SiriusEditor.getFontRegistry().get("required"));

        TypeContentProposalProvider.bindCompletionProcessor(this, text);

        // Start of user code create controls
        TypeContentProposalProvider.bindCompletionProcessor(this, text);
        // End of user code create controls

    }

    /**
     * {@inheritDoc}
     */
    protected String getPropertyDescription() {
        return "";
    }

    // Start of user code user operations

    // End of user code user operations
}
