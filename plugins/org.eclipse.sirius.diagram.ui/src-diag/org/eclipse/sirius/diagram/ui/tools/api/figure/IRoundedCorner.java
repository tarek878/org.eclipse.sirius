/*******************************************************************************
 * Copyright (c) 2007, 2008, 2009 THALES GLOBAL SERVICES.
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
package org.eclipse.sirius.diagram.ui.tools.api.figure;

/**
 * Interface for figures having rounded corners.
 * 
 * @author cedric
 * 
 */
public interface IRoundedCorner {
    /**
     * return the corner width.
     * 
     * @return the corner width
     */
    int getCornerWidth();

    /**
     * return the corner height.
     * 
     * @return the corner height
     */
    int getCornerHeight();
}
