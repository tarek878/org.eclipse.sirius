/*******************************************************************************
 * Copyright (c) 2008 THALES GLOBAL SERVICES.
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
package org.eclipse.sirius.business.internal.metamodel.description.validation.spec;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.internal.metamodel.description.validation.operations.ValidationRuleSpecOperations;
import org.eclipse.sirius.viewpoint.description.validation.impl.SemanticValidationRuleImpl;

/**
 * Implementation of SemanticValidationRule.
 * 
 * @author ymortier
 */
public class SemanticValidationRuleSpec extends SemanticValidationRuleImpl {

    /**
     * {@inheritDoc}
     * 
     * @see org.eclipse.sirius.viewpoint.description.validation.impl.ValidationRuleImpl#checkRule(org.eclipse.emf.ecore.EObject)
     */
    @Override
    public boolean checkRule(final EObject obj) {
        return ValidationRuleSpecOperations.checkRule(this, obj);
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.eclipse.sirius.viewpoint.description.validation.impl.ValidationRuleImpl#getMessage(org.eclipse.emf.ecore.EObject)
     */
    @Override
    public String getMessage(final EObject obj) {
        return ValidationRuleSpecOperations.getMessage(this, obj);
    }

}
