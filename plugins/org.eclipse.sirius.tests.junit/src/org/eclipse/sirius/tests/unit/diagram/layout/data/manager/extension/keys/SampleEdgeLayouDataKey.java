/*******************************************************************************
 * Copyright (c) 2010, 2014 THALES GLOBAL SERVICES.
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
package org.eclipse.sirius.tests.unit.diagram.layout.data.manager.extension.keys;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.DEdge;

/**
 * Specific key for {@link DEdge}.
 * 
 * @author mporhel
 */
public class SampleEdgeLayouDataKey extends AbstractSampleLayouDataKey {

    /**
     * Default constructor.
     * 
     * @param key
     *            The key
     */
    public SampleEdgeLayouDataKey(final EObject key) {
        super(key);
    }
}
