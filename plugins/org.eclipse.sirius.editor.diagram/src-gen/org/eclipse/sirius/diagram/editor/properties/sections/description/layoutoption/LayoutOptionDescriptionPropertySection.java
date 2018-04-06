/*******************************************************************************
 * Copyright (c) 2007, 2017 THALES GLOBAL SERVICES.
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
package org.eclipse.sirius.diagram.editor.properties.sections.description.layoutoption;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.sirius.diagram.description.DescriptionPackage;
import org.eclipse.sirius.editor.editorPlugin.SiriusEditor;
import org.eclipse.sirius.editor.properties.sections.common.AbstractMultilinePropertySection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

// End of user code imports

/**
 * A section for the description property of a LayoutOption object.
 */
public class LayoutOptionDescriptionPropertySection extends AbstractMultilinePropertySection {

    /**
     * @see org.eclipse.sirius.diagram.editor.properties.sections.AbstractMultilinePropertySection#getDefaultLabelText()
     */
    protected String getDefaultLabelText() {
        return "Description"; //$NON-NLS-1$
    }

    /**
     * @see org.eclipse.sirius.diagram.editor.properties.sections.AbstractMultilinePropertySection#getLabelText()
     */
    protected String getLabelText() {
        String labelText;
        labelText = super.getLabelText() + ":"; //$NON-NLS-1$
        // Start of user code get label text

        // End of user code get label text
        return labelText;
    }

    /**
     * @see org.eclipse.sirius.diagram.editor.properties.sections.AbstractMultilinePropertySection#getFeature()
     */
    public EAttribute getFeature() {
        return DescriptionPackage.eINSTANCE.getLayoutOption_Description();
    }

    /**
     * @see org.eclipse.sirius.diagram.editor.properties.sections.AbstractMultilinePropertySection#getFeatureValue(String)
     */
    protected Object getFeatureValue(String newText) {
        return newText;
    }

    /**
     * @see org.eclipse.sirius.diagram.editor.properties.sections.AbstractMultilinePropertySection#isEqual(String)
     */
    protected boolean isEqual(String newText) {
        return getFeatureAsText().equals(newText);
    }

    /**
     * {@inheritDoc}
     */
    public void createControls(Composite parent, TabbedPropertySheetPage tabbedPropertySheetPage) {
        super.createControls(parent, tabbedPropertySheetPage);

        // Start of user code create controls
        text.setEditable(false);
        text.setEnabled(false);
        text.setBackground(SiriusEditor.getColorRegistry().get("lightgrey"));
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
