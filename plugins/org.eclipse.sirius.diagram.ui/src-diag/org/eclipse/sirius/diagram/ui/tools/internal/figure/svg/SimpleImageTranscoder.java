/**
 * Copyright (c) 2008, 2015 Borland Software Corporation and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Dmitry Stadnik - initial API and implementation
 *    Laurent Redor (Obeo) <laurent.redor@obeo.fr>  - Extract from plug-in org.eclipse.gmf.runtime.lite.svg
 */
package org.eclipse.sirius.diagram.ui.tools.internal.figure.svg;

import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

import org.apache.batik.gvt.renderer.ImageRenderer;
import org.apache.batik.gvt.renderer.StaticRenderer;
import org.apache.batik.transcoder.SVGAbstractTranscoder;
import org.apache.batik.transcoder.TranscoderException;
import org.apache.batik.transcoder.TranscoderInput;
import org.apache.batik.transcoder.TranscoderOutput;
import org.apache.batik.transcoder.image.ImageTranscoder;
import org.eclipse.draw2d.Graphics;
import org.eclipse.sirius.diagram.DiagramPlugin;
import org.eclipse.sirius.diagram.ui.provider.Messages;
import org.w3c.dom.Document;

//CHECKSTYLE:OFF
public class SimpleImageTranscoder extends SVGAbstractTranscoder {

    private BufferedImage bufferedImage;

    private Document document;

    private int canvasWidth = -1, canvasHeight = -1;

    private Rectangle2D canvasAOI;

    private RenderingHints renderingHints;

    public SimpleImageTranscoder(Document document) {
        this.document = document;
        renderingHints = new RenderingHints(null);
    }

    public final Document getDocument() {
        return document;
    }

    public final int getCanvasWidth() {
        return canvasWidth;
    }

    public final int getCanvasHeight() {
        return canvasHeight;
    }

    public void setCanvasSize(int width, int height) {
        if (this.canvasWidth == width && this.canvasHeight == height) {
            return;
        }
        this.canvasWidth = width;
        this.canvasHeight = height;
        contentChanged();
    }

    public void contentChanged() {
        bufferedImage = null;
    }

    private void updateImage() {
        if (document == null) {
            return;
        }
        try {
            if (canvasWidth > 0) {
                addTranscodingHint(ImageTranscoder.KEY_WIDTH, new Float(canvasWidth));
            } else {
                removeTranscodingHint(ImageTranscoder.KEY_WIDTH);
            }
            if (canvasHeight > 0) {
                addTranscodingHint(ImageTranscoder.KEY_HEIGHT, new Float(canvasHeight));
            } else {
                removeTranscodingHint(ImageTranscoder.KEY_HEIGHT);
            }
            if (canvasAOI != null) {
                addTranscodingHint(ImageTranscoder.KEY_AOI, canvasAOI);
            } else {
                removeTranscodingHint(ImageTranscoder.KEY_AOI);
            }
            transcode(new TranscoderInput(document), new TranscoderOutput());
        } catch (TranscoderException e) {
            DiagramPlugin.getDefault().logError(Messages.SimpleImageTranscoder_svgImageTranscodingError, e);
        }
    }

    @Override
    protected void transcode(Document document, String uri, TranscoderOutput output) throws TranscoderException {
        super.transcode(document, uri, output);
        int w = (int) (width + 0.5);
        int h = (int) (height + 0.5);
        ImageRenderer renderer = createImageRenderer();
        renderer.updateOffScreen(w, h);
        // curTxf.translate(0.5, 0.5);
        renderer.setTransform(curTxf);
        renderer.setTree(this.root);
        this.root = null; // We're done with it...
        try {
            Shape raoi = new Rectangle2D.Float(0, 0, width, height);
            // Warning: the renderer's AOI must be in user space
            renderer.repaint(curTxf.createInverse().createTransformedShape(raoi));
            bufferedImage = renderer.getOffScreen();
        } catch (Exception ex) {
            throw new TranscoderException(ex);
        }
    }

    protected ImageRenderer createImageRenderer() {
        StaticRenderer renderer = new StaticRenderer();
        renderer.getRenderingHints().add(renderingHints);
        return renderer;
    }

    public final BufferedImage getBufferedImage() {
        if (bufferedImage == null) {
            updateImage();
        }
        return bufferedImage;
    }

    public int getImageHeight() {
        int height = 0;
        int canvasHeight = getCanvasHeight();
        if (canvasHeight == -1) {
            height = getBufferedImage().getHeight();
        } else {
            height = canvasHeight;
        }
        return height;
    }

    public int getImageWidth() {
        int width = 0;
        int canvasWidth = getCanvasWidth();
        if (canvasWidth == -1) {
            width = getBufferedImage().getWidth();
        } else {
            width = canvasWidth;
        }
        return width;
    }

    public int getImageAlphaValue(int x, int y) {
        BufferedImage bufferedImage = getBufferedImage();
        if (bufferedImage != null && bufferedImage.getWidth() >= x && bufferedImage.getHeight() >= y) {
            int[] result = bufferedImage.getAlphaRaster().getPixel(x, y, new int[1]);
            return result[0];
        }
        return 255;
    }

    public double getAspectRatio() {
        int canvasHeight = getCanvasHeight();
        int canvasWidth = getCanvasWidth();

        if (canvasHeight == -1 || canvasWidth == -1) {
            int width = getBufferedImage().getWidth();
            int height = getBufferedImage().getHeight();
            return (double) width / (double) height;
        } else {
            return (double) canvasWidth / (double) canvasHeight;
        }
    }

    public void updateRenderingHints(Graphics graphics) {
        Object antiAliasHint = SVGUtils.getAntialiasHint(graphics);
        if (renderingHints.get(RenderingHints.KEY_ANTIALIASING) != antiAliasHint) {
            renderingHints.put(RenderingHints.KEY_ANTIALIASING, antiAliasHint);
            contentChanged();
        }
        Object textAntiAliasHint = SVGUtils.getTextAntialiasHint(graphics);
        if (renderingHints.get(RenderingHints.KEY_TEXT_ANTIALIASING) != textAntiAliasHint) {
            renderingHints.put(RenderingHints.KEY_TEXT_ANTIALIASING, textAntiAliasHint);
            contentChanged();
        }
    }
}
// CHECKSTYLE:ON
