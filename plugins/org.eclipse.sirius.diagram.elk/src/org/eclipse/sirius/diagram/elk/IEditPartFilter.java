/*******************************************************************************
 * Copyright (c) 2016 Kiel University and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Kiel University - initial API and implementation
 *******************************************************************************/
package org.eclipse.sirius.diagram.elk;

import org.eclipse.gef.EditPart;

import com.google.inject.ImplementedBy;

/**
 * Interface for edit part filters. Use this to exclude certain diagram parts
 * from automatic layout.
 * 
 * Copied from org.eclipse.elk.conn.gmf.IEditPartFilter of commit
 * e99248e44c71a5a02fe45bc4cd5150cd7f50c559.
 */
@ImplementedBy(IEditPartFilter.DefaultImpl.class)
public interface IEditPartFilter {

    /**
     * Whether to accept the given edit part and include it in the layout graph.
     */
    boolean filter(EditPart editPart);

    /**
     * This implementation includes all edit parts (returns always
     * {@code true}).
     */
    class DefaultImpl implements IEditPartFilter {

        @Override
        public boolean filter(final EditPart editPart) {
            return true;
        }

    }

}
