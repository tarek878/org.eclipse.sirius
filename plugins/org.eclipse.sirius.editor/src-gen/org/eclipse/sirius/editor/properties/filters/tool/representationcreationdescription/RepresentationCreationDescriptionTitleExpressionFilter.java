/*******************************************************************************
 * Copyright (c) 2007, 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.sirius.editor.properties.filters.tool.representationcreationdescription;

// Start of user code specific imports

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.sirius.viewpoint.description.tool.ToolPackage;
import org.eclipse.sirius.editor.properties.filters.common.ViewpointPropertyFilter;

// End of user code specific imports


/**
 * A filter for the titleExpression property section.
 */
public class RepresentationCreationDescriptionTitleExpressionFilter extends ViewpointPropertyFilter {

	/**
	 * {@inheritDoc}
	 */
	protected EStructuralFeature getFeature() {
		return ToolPackage.eINSTANCE.getRepresentationCreationDescription_TitleExpression();
	}
	
	/**
	 * {@inheritDoc}
	 */
	protected boolean isRightInputType(Object arg0) {
        return arg0 instanceof org.eclipse.sirius.viewpoint.description.tool.RepresentationCreationDescription;
    }
	
	// Start of user code user methods

    // End of user code user methods
	
	

}