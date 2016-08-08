/*******************************************************************************
 * Copyright (c) 2016 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.sirius.properties.editor.properties.filters.properties.widgetstyle;

// Start of user code specific imports

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.sirius.properties.PropertiesPackage;
import org.eclipse.sirius.properties.editor.properties.filters.common.ViewpointPropertyFilter;

// End of user code specific imports


/**
 * A filter for the labelBackgroundColor property section.
 */
public class WidgetStyleLabelBackgroundColorFilter extends ViewpointPropertyFilter {

	/**
	 * {@inheritDoc}
	 */
	protected EStructuralFeature getFeature() {
		return PropertiesPackage.eINSTANCE.getWidgetStyle_LabelBackgroundColor();
	}
	
	/**
	 * {@inheritDoc}
	 */
	protected boolean isRightInputType(Object arg0) {
        return arg0 instanceof org.eclipse.sirius.properties.WidgetStyle;
    }
	
	// Start of user code user methods

    // End of user code user methods
	
	

}