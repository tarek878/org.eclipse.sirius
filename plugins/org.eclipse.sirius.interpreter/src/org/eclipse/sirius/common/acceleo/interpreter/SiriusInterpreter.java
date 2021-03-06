/*******************************************************************************
 * Copyright (c) 2011 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.sirius.common.acceleo.interpreter;

import java.util.concurrent.Callable;

import org.eclipse.acceleo.ui.interpreter.internal.SWTUtil;
import org.eclipse.acceleo.ui.interpreter.language.AbstractLanguageInterpreter;
import org.eclipse.acceleo.ui.interpreter.language.EvaluationContext;
import org.eclipse.acceleo.ui.interpreter.language.EvaluationResult;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.source.SourceViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

/**
 * This implementation of a language interpreter adds the viewpoint interpreter
 * to the list of languages available to the interpreter view.
 * 
 * @author <a href="mailto:laurent.goubet@obeo.fr">Laurent Goubet</a>
 */
public class SiriusInterpreter extends AbstractLanguageInterpreter {
    /**
     * {@inheritDoc}
     * 
     * @see org.eclipse.acceleo.ui.interpreter.language.AbstractLanguageInterpreter#getEvaluationTask(org.eclipse.acceleo.ui.interpreter.language.EvaluationContext)
     */
    @Override
    public Callable<EvaluationResult> getEvaluationTask(EvaluationContext context) {
        return new SiriusEvaluationTask(context);
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.eclipse.acceleo.ui.interpreter.language.AbstractLanguageInterpreter#createSourceViewer(org.eclipse.swt.widgets.Composite)
     */
    @Override
    public SourceViewer createSourceViewer(Composite parent) {
        final SourceViewer viewer = new SiriusInterpreterSourceViewer(parent, null, SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
        final SiriusSourceViewerConfiguration config = new SiriusSourceViewerConfiguration();
        viewer.configure(config);
        SWTUtil.setUpScrollableListener(viewer.getTextWidget());
        viewer.setDocument(new Document());
        return viewer;
    }
}
