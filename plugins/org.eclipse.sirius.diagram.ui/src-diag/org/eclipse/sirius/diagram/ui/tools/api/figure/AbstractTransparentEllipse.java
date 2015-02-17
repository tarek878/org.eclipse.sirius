/*******************************************************************************
 * Copyright (c) 2010 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.sirius.diagram.ui.tools.api.figure;

import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.Graphics;
import org.eclipse.sirius.diagram.ui.tools.internal.figure.TransparentFigureGraphicsModifier;

/**
 * An abstract ellipse figure to handle transparency.
 *
 * @mporhel
 */
public abstract class AbstractTransparentEllipse extends Ellipse implements StyledFigure, ITransparentFigure {

    private int viewpointAlpha = ITransparentFigure.DEFAULT_ALPHA;

    private boolean transparent;

    @Override
    protected void fillShape(Graphics graphics) {
        TransparentFigureGraphicsModifier modifier = new TransparentFigureGraphicsModifier(this, graphics);
        modifier.pushState();
        super.fillShape(graphics);
        modifier.popState();
    }

    @Override
    public int getSiriusAlpha() {
        return viewpointAlpha;
    }

    @Override
    public boolean isTransparent() {
        return transparent;
    }

    @Override
    public void setSiriusAlpha(int alpha) {
        this.viewpointAlpha = alpha;
    }

    @Override
    public void setTransparent(boolean transparent) {
        this.transparent = transparent;
    }
}
