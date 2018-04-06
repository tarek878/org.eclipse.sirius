/*******************************************************************************
 * Copyright (c) 2016 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.sirius.properties.editor.properties.sections.properties.dialogbutton;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.sirius.editor.properties.sections.common.AbstractTextPropertySection;
import org.eclipse.sirius.properties.PropertiesPackage;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

// End of user code imports

/**
 * A section for the rollbackChangesOnClose property of a DialogButton object.
 */
public class DialogButtonRollbackChangesOnClosePropertySection extends AbstractTextPropertySection {

    /**
     * @see org.eclipse.sirius.properties.editor.properties.sections.AbstractTextPropertySection#getDefaultLabelText()
     */
    @Override
    protected String getDefaultLabelText() {
        return "RollbackChangesOnClose"; //$NON-NLS-1$
    }

    /**
     * @see org.eclipse.sirius.properties.editor.properties.sections.AbstractTextPropertySection#getLabelText()
     */
    @Override
    protected String getLabelText() {
        String labelText;
        labelText = super.getLabelText() + ":"; //$NON-NLS-1$
        // Start of user code get label text

        // End of user code get label text
        return labelText;
    }

    /**
     * @see org.eclipse.sirius.properties.editor.properties.sections.AbstractTextPropertySection#getFeature()
     */
    @Override
    public EAttribute getFeature() {
        return PropertiesPackage.eINSTANCE.getDialogButton_RollbackChangesOnClose();
    }

    /**
     * @see org.eclipse.sirius.properties.editor.properties.sections.AbstractTextPropertySection#getFeatureValue(String)
     */
    @Override
    protected Object getFeatureValue(String newText) {
        return newText;
    }

    /**
     * @see org.eclipse.sirius.properties.editor.properties.sections.AbstractTextPropertySection#isEqual(String)
     */
    @Override
    protected boolean isEqual(String newText) {
        return getFeatureAsText().equals(newText);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void createControls(Composite parent, TabbedPropertySheetPage tabbedPropertySheetPage) {
        super.createControls(parent, tabbedPropertySheetPage);

        // Start of user code create controls

        // End of user code create controls

    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getPropertyDescription() {
        return "";
    }

    // Start of user code user operations

    // End of user code user operations
}
