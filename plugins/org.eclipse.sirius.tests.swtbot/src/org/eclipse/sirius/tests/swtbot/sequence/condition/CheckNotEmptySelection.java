/*******************************************************************************
 * Copyright (c) 2010, 2017 THALES GLOBAL SERVICES.
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
package org.eclipse.sirius.tests.swtbot.sequence.condition;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.sirius.diagram.sequence.ui.tool.internal.edit.part.SequenceMessageEditPart;
import org.eclipse.sirius.tests.swtbot.support.api.editor.SWTBotSiriusDiagramEditor;
import org.eclipse.swtbot.swt.finder.waits.DefaultCondition;

public class CheckNotEmptySelection extends DefaultCondition {

    private SWTBotSiriusDiagramEditor editor;

    private Class<SequenceMessageEditPart> expectedType;

    public CheckNotEmptySelection(SWTBotSiriusDiagramEditor editor, Class<SequenceMessageEditPart> expectedType) {
        this.editor = editor;
        this.expectedType = expectedType;
    }

    @Override
    public boolean test() throws Exception {
        ISelection selection = editor.getSelection();
        if (expectedType == null) {
            return !selection.isEmpty();
        } else if (selection instanceof StructuredSelection) {
            StructuredSelection sel = (StructuredSelection) selection;
            return expectedType.isInstance(sel.getFirstElement());
        }
        return false;
    }

    @Override
    public String getFailureMessage() {
        return null;
    }

}
