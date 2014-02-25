/*******************************************************************************
 * Copyright (c) 2012, 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.sirius.diagram.ui.tools.internal.editor.tabbar;

import org.eclipse.gef.ui.actions.ZoomInAction;
import org.eclipse.gef.ui.actions.ZoomOutAction;
import org.eclipse.gmf.runtime.common.ui.action.IDisposableAction;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.sirius.diagram.ui.tools.api.editor.DDiagramEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.ui.forms.FormColors;

/**
 * {@link ToolBarManager} extension for tabbar.
 * 
 * @author fbarbin
 * 
 */
public class TabbarToolBarManager extends ToolBarManager {

    private IWorkbenchPart tabbarPart;

    private Image fGradientBackground;

    /**
     * Constructor.
     * 
     * @param toolBar
     *            the tool bar control.
     * @param part
     *            the tabbar part.
     */
    public TabbarToolBarManager(ToolBar toolBar, IWorkbenchPart part) {
        super(toolBar);
        this.tabbarPart = part;

    }

    @Override
    public void add(IAction action) {
        super.add(action);
        if (action instanceof IDisposableAction) {
            ((IDisposableAction) action).init();
        }
    }

    @Override
    protected void itemRemoved(IContributionItem item) {
        if (item instanceof ActionContributionItem) {
            IAction action = ((ActionContributionItem) item).getAction();
            if (action instanceof IDisposableAction) {
                ((IDisposableAction) action).dispose();
            } else if (action instanceof IWorkbenchAction) {
                ((IWorkbenchAction) action).dispose();
            } else if (action instanceof ZoomInAction) {
                ((ZoomInAction) action).dispose();
            } else if (action instanceof ZoomOutAction) {
                ((ZoomOutAction) action).dispose();
            }
        }
        item.dispose();
    }

    @Override
    public void update(boolean force) {
        IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
        if (activePage != null && tabbarPart instanceof DDiagramEditor && activePage.getActivePart() != tabbarPart) {
            if (getControl().getItems().length > 0) {
                // part is not focused -> return.
                return;
            }
        }
        super.update(force);
        updateGradientBackground();
    }

    /**
     * Update the gradient background if needed:
     * <UL>
     * <LI>the height of the toolbar is more than 0, and</LI>
     * <LI>the gradient background has never been initialized</LI>
     * <LI>or the gradient background height is different than the current
     * height of the toolbar.</LI>
     * <UL>
     */
    protected void updateGradientBackground() {
        if (getControl() == null)
            return;
        int height = getControl().getClientArea().height;
        if (height > 0) {
            if (fGradientBackground == null || fGradientBackground.getBounds().height != height) {
                Image image = createGradientImage(height, Display.getCurrent());
                getControl().setBackgroundImage(image);

                if (fGradientBackground != null) {
                    fGradientBackground.dispose();
                }
                fGradientBackground = image;
            }
        }
    }

    /**
     * The image to use for the breadcrumb background as specified in
     * https://bugs.eclipse.org/bugs/show_bug.cgi?id=221477
     * 
     * @param height
     *            the height of the image to create
     * @param display
     *            the current display
     * @return the image for the breadcrumb background
     */
    private Image createGradientImage(int height, Display display) {
        int width = 50;

        Image result = new Image(display, width, height);

        GC gc = new GC(result);

        Color colorC = createColor(SWT.COLOR_WIDGET_BACKGROUND, SWT.COLOR_LIST_BACKGROUND, 35, display);
        Color colorD = createColor(SWT.COLOR_WIDGET_BACKGROUND, SWT.COLOR_LIST_BACKGROUND, 45, display);
        Color colorE = createColor(SWT.COLOR_WIDGET_BACKGROUND, SWT.COLOR_LIST_BACKGROUND, 80, display);
        Color colorF = createColor(SWT.COLOR_WIDGET_BACKGROUND, SWT.COLOR_LIST_BACKGROUND, 70, display);
        Color colorG = createColor(SWT.COLOR_WIDGET_BACKGROUND, SWT.COLOR_WHITE, 45, display);
        Color colorH = createColor(SWT.COLOR_WIDGET_NORMAL_SHADOW, SWT.COLOR_LIST_BACKGROUND, 35, display);

        try {
            drawLine(width, 0, colorC, gc);
            drawLine(width, 1, colorC, gc);

            gc.setForeground(colorD);
            gc.setBackground(colorE);
            gc.fillGradientRectangle(0, 2, width, 2 + 8, true);

            gc.setBackground(colorE);
            gc.fillRectangle(0, 2 + 9, width, height - 4);

            drawLine(width, height - 3, colorF, gc);
            drawLine(width, height - 2, colorG, gc);
            drawLine(width, height - 1, colorH, gc);

        } finally {
            gc.dispose();

            colorC.dispose();
            colorD.dispose();
            colorE.dispose();
            colorF.dispose();
            colorG.dispose();
            colorH.dispose();
        }

        return result;
    }

    private void drawLine(int width, int position, Color color, GC gc) {
        gc.setForeground(color);
        gc.drawLine(0, position, width, position);
    }

    private Color createColor(int color1, int color2, int ratio, Display display) {
        RGB rgb1 = display.getSystemColor(color1).getRGB();
        RGB rgb2 = display.getSystemColor(color2).getRGB();

        RGB blend = FormColors.blend(rgb2, rgb1, ratio);

        return new Color(display, blend);
    }

    @Override
    public void dispose() {
        super.dispose();
        tabbarPart = null;
        if (fGradientBackground != null) {
            fGradientBackground.dispose();
            fGradientBackground = null;
        }
    }
}
