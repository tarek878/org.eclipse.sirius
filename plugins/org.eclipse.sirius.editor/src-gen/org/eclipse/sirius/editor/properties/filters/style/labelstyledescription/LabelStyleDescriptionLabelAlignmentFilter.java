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
package org.eclipse.sirius.editor.properties.filters.style.labelstyledescription;

// Start of user code specific imports

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.sirius.editor.properties.filters.common.ViewpointPropertyFilter;
import org.eclipse.sirius.viewpoint.description.style.StylePackage;

// End of user code specific imports

/**
 * A filter for the labelAlignment property section.
 */
public class LabelStyleDescriptionLabelAlignmentFilter extends ViewpointPropertyFilter {

    /**
     * {@inheritDoc}
     */
    protected EStructuralFeature getFeature() {
        return StylePackage.eINSTANCE.getLabelStyleDescription_LabelAlignment();
    }

    /**
     * {@inheritDoc}
     */
    protected boolean isRightInputType(Object arg0) {
        return arg0 instanceof org.eclipse.sirius.viewpoint.description.style.LabelStyleDescription;
    }

    // Start of user code user methods
    public boolean select(Object arg0) {
        if (isRightInputType(arg0) && !(arg0.getClass().getName().contains("TreeItemStyleDescription"))) {
            EStructuralFeature feature = getFeature();
            if (feature != null && isVisible(feature)) {
                return true;
            }
        }
        return false;
    }
    // End of user code user methods

}
