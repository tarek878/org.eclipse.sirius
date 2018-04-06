/**
 * Copyright (c) 2007, 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *
 */
package org.eclipse.sirius.diagram.description.style.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.sirius.diagram.description.style.util.StyleAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers. The adapters generated by this
 * factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}. The adapters
 * also support Eclipse property sheets. Note that most of the adapters are shared among multiple instances. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class StyleItemProviderAdapterFactory extends StyleAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
    /**
     * This keeps track of the root adapter factory that delegates to this adapter factory. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected ComposedAdapterFactory parentAdapterFactory;

    /**
     * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected IChangeNotifier changeNotifier = new ChangeNotifier();

    /**
     * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected Collection<Object> supportedTypes = new ArrayList<Object>();

    /**
     * This constructs an instance. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public StyleItemProviderAdapterFactory() {
        supportedTypes.add(IEditingDomainItemProvider.class);
        supportedTypes.add(IStructuredItemContentProvider.class);
        supportedTypes.add(ITreeItemContentProvider.class);
        supportedTypes.add(IItemLabelProvider.class);
        supportedTypes.add(IItemPropertySource.class);
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.diagram.description.style.BorderedStyleDescription} instances. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected BorderedStyleDescriptionItemProvider borderedStyleDescriptionItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.diagram.description.style.BorderedStyleDescription}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createBorderedStyleDescriptionAdapter() {
        if (borderedStyleDescriptionItemProvider == null) {
            borderedStyleDescriptionItemProvider = new BorderedStyleDescriptionItemProvider(this);
        }

        return borderedStyleDescriptionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.diagram.description.style.CustomStyleDescription} instances. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected CustomStyleDescriptionItemProvider customStyleDescriptionItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.diagram.description.style.CustomStyleDescription}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createCustomStyleDescriptionAdapter() {
        if (customStyleDescriptionItemProvider == null) {
            customStyleDescriptionItemProvider = new CustomStyleDescriptionItemProvider(this);
        }

        return customStyleDescriptionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.diagram.description.style.SquareDescription} instances. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected SquareDescriptionItemProvider squareDescriptionItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.diagram.description.style.SquareDescription}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createSquareDescriptionAdapter() {
        if (squareDescriptionItemProvider == null) {
            squareDescriptionItemProvider = new SquareDescriptionItemProvider(this);
        }

        return squareDescriptionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.diagram.description.style.LozengeNodeDescription} instances. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected LozengeNodeDescriptionItemProvider lozengeNodeDescriptionItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.diagram.description.style.LozengeNodeDescription}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createLozengeNodeDescriptionAdapter() {
        if (lozengeNodeDescriptionItemProvider == null) {
            lozengeNodeDescriptionItemProvider = new LozengeNodeDescriptionItemProvider(this);
        }

        return lozengeNodeDescriptionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.diagram.description.style.EllipseNodeDescription} instances. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected EllipseNodeDescriptionItemProvider ellipseNodeDescriptionItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.diagram.description.style.EllipseNodeDescription}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createEllipseNodeDescriptionAdapter() {
        if (ellipseNodeDescriptionItemProvider == null) {
            ellipseNodeDescriptionItemProvider = new EllipseNodeDescriptionItemProvider(this);
        }

        return ellipseNodeDescriptionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.diagram.description.style.BundledImageDescription} instances. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected BundledImageDescriptionItemProvider bundledImageDescriptionItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.diagram.description.style.BundledImageDescription}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createBundledImageDescriptionAdapter() {
        if (bundledImageDescriptionItemProvider == null) {
            bundledImageDescriptionItemProvider = new BundledImageDescriptionItemProvider(this);
        }

        return bundledImageDescriptionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.diagram.description.style.NoteDescription} instances. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected NoteDescriptionItemProvider noteDescriptionItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.diagram.description.style.NoteDescription}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createNoteDescriptionAdapter() {
        if (noteDescriptionItemProvider == null) {
            noteDescriptionItemProvider = new NoteDescriptionItemProvider(this);
        }

        return noteDescriptionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.diagram.description.style.DotDescription} instances. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected DotDescriptionItemProvider dotDescriptionItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.diagram.description.style.DotDescription}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createDotDescriptionAdapter() {
        if (dotDescriptionItemProvider == null) {
            dotDescriptionItemProvider = new DotDescriptionItemProvider(this);
        }

        return dotDescriptionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.diagram.description.style.GaugeCompositeStyleDescription} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected GaugeCompositeStyleDescriptionItemProvider gaugeCompositeStyleDescriptionItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.eclipse.sirius.diagram.description.style.GaugeCompositeStyleDescription}. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createGaugeCompositeStyleDescriptionAdapter() {
        if (gaugeCompositeStyleDescriptionItemProvider == null) {
            gaugeCompositeStyleDescriptionItemProvider = new GaugeCompositeStyleDescriptionItemProvider(this);
        }

        return gaugeCompositeStyleDescriptionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.diagram.description.style.GaugeSectionDescription} instances. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected GaugeSectionDescriptionItemProvider gaugeSectionDescriptionItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.diagram.description.style.GaugeSectionDescription}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createGaugeSectionDescriptionAdapter() {
        if (gaugeSectionDescriptionItemProvider == null) {
            gaugeSectionDescriptionItemProvider = new GaugeSectionDescriptionItemProvider(this);
        }

        return gaugeSectionDescriptionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.diagram.description.style.FlatContainerStyleDescription} instances. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected FlatContainerStyleDescriptionItemProvider flatContainerStyleDescriptionItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.diagram.description.style.FlatContainerStyleDescription}.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createFlatContainerStyleDescriptionAdapter() {
        if (flatContainerStyleDescriptionItemProvider == null) {
            flatContainerStyleDescriptionItemProvider = new FlatContainerStyleDescriptionItemProvider(this);
        }

        return flatContainerStyleDescriptionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.diagram.description.style.ShapeContainerStyleDescription} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ShapeContainerStyleDescriptionItemProvider shapeContainerStyleDescriptionItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.eclipse.sirius.diagram.description.style.ShapeContainerStyleDescription}. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createShapeContainerStyleDescriptionAdapter() {
        if (shapeContainerStyleDescriptionItemProvider == null) {
            shapeContainerStyleDescriptionItemProvider = new ShapeContainerStyleDescriptionItemProvider(this);
        }

        return shapeContainerStyleDescriptionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.diagram.description.style.WorkspaceImageDescription} instances. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected WorkspaceImageDescriptionItemProvider workspaceImageDescriptionItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.diagram.description.style.WorkspaceImageDescription}.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createWorkspaceImageDescriptionAdapter() {
        if (workspaceImageDescriptionItemProvider == null) {
            workspaceImageDescriptionItemProvider = new WorkspaceImageDescriptionItemProvider(this);
        }

        return workspaceImageDescriptionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.diagram.description.style.EdgeStyleDescription} instances. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected EdgeStyleDescriptionItemProvider edgeStyleDescriptionItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.diagram.description.style.EdgeStyleDescription}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createEdgeStyleDescriptionAdapter() {
        if (edgeStyleDescriptionItemProvider == null) {
            edgeStyleDescriptionItemProvider = new EdgeStyleDescriptionItemProvider(this);
        }

        return edgeStyleDescriptionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.diagram.description.style.BeginLabelStyleDescription} instances. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected BeginLabelStyleDescriptionItemProvider beginLabelStyleDescriptionItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.diagram.description.style.BeginLabelStyleDescription}.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createBeginLabelStyleDescriptionAdapter() {
        if (beginLabelStyleDescriptionItemProvider == null) {
            beginLabelStyleDescriptionItemProvider = new BeginLabelStyleDescriptionItemProvider(this);
        }

        return beginLabelStyleDescriptionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.diagram.description.style.CenterLabelStyleDescription} instances. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected CenterLabelStyleDescriptionItemProvider centerLabelStyleDescriptionItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.diagram.description.style.CenterLabelStyleDescription}.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createCenterLabelStyleDescriptionAdapter() {
        if (centerLabelStyleDescriptionItemProvider == null) {
            centerLabelStyleDescriptionItemProvider = new CenterLabelStyleDescriptionItemProvider(this);
        }

        return centerLabelStyleDescriptionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.diagram.description.style.EndLabelStyleDescription} instances. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected EndLabelStyleDescriptionItemProvider endLabelStyleDescriptionItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.diagram.description.style.EndLabelStyleDescription}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createEndLabelStyleDescriptionAdapter() {
        if (endLabelStyleDescriptionItemProvider == null) {
            endLabelStyleDescriptionItemProvider = new EndLabelStyleDescriptionItemProvider(this);
        }

        return endLabelStyleDescriptionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.diagram.description.style.BracketEdgeStyleDescription} instances. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected BracketEdgeStyleDescriptionItemProvider bracketEdgeStyleDescriptionItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.diagram.description.style.BracketEdgeStyleDescription}.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createBracketEdgeStyleDescriptionAdapter() {
        if (bracketEdgeStyleDescriptionItemProvider == null) {
            bracketEdgeStyleDescriptionItemProvider = new BracketEdgeStyleDescriptionItemProvider(this);
        }

        return bracketEdgeStyleDescriptionItemProvider;
    }

    /**
     * This returns the root adapter factory that contains this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ComposeableAdapterFactory getRootAdapterFactory() {
        return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
    }

    /**
     * This sets the composed adapter factory that contains this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
        this.parentAdapterFactory = parentAdapterFactory;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object type) {
        return supportedTypes.contains(type) || super.isFactoryForType(type);
    }

    /**
     * This implementation substitutes the factory itself as the key for the adapter. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter adapt(Notifier notifier, Object type) {
        return super.adapt(notifier, this);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object adapt(Object object, Object type) {
        if (isFactoryForType(type)) {
            Object adapter = super.adapt(object, type);
            if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
                return adapter;
            }
        }

        return null;
    }

    /**
     * This adds a listener. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void addListener(INotifyChangedListener notifyChangedListener) {
        changeNotifier.addListener(notifyChangedListener);
    }

    /**
     * This removes a listener. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void removeListener(INotifyChangedListener notifyChangedListener) {
        changeNotifier.removeListener(notifyChangedListener);
    }

    /**
     * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    public void fireNotifyChanged(Notification notification) {
        changeNotifier.fireNotifyChanged(notification);

        if (parentAdapterFactory != null) {
            parentAdapterFactory.fireNotifyChanged(notification);
        }
    }

    /**
     * This disposes all of the item providers created by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void dispose() {
        if (borderedStyleDescriptionItemProvider != null) {
            borderedStyleDescriptionItemProvider.dispose();
        }
        if (customStyleDescriptionItemProvider != null) {
            customStyleDescriptionItemProvider.dispose();
        }
        if (squareDescriptionItemProvider != null) {
            squareDescriptionItemProvider.dispose();
        }
        if (lozengeNodeDescriptionItemProvider != null) {
            lozengeNodeDescriptionItemProvider.dispose();
        }
        if (ellipseNodeDescriptionItemProvider != null) {
            ellipseNodeDescriptionItemProvider.dispose();
        }
        if (bundledImageDescriptionItemProvider != null) {
            bundledImageDescriptionItemProvider.dispose();
        }
        if (noteDescriptionItemProvider != null) {
            noteDescriptionItemProvider.dispose();
        }
        if (dotDescriptionItemProvider != null) {
            dotDescriptionItemProvider.dispose();
        }
        if (gaugeCompositeStyleDescriptionItemProvider != null) {
            gaugeCompositeStyleDescriptionItemProvider.dispose();
        }
        if (gaugeSectionDescriptionItemProvider != null) {
            gaugeSectionDescriptionItemProvider.dispose();
        }
        if (flatContainerStyleDescriptionItemProvider != null) {
            flatContainerStyleDescriptionItemProvider.dispose();
        }
        if (shapeContainerStyleDescriptionItemProvider != null) {
            shapeContainerStyleDescriptionItemProvider.dispose();
        }
        if (workspaceImageDescriptionItemProvider != null) {
            workspaceImageDescriptionItemProvider.dispose();
        }
        if (edgeStyleDescriptionItemProvider != null) {
            edgeStyleDescriptionItemProvider.dispose();
        }
        if (beginLabelStyleDescriptionItemProvider != null) {
            beginLabelStyleDescriptionItemProvider.dispose();
        }
        if (centerLabelStyleDescriptionItemProvider != null) {
            centerLabelStyleDescriptionItemProvider.dispose();
        }
        if (endLabelStyleDescriptionItemProvider != null) {
            endLabelStyleDescriptionItemProvider.dispose();
        }
        if (bracketEdgeStyleDescriptionItemProvider != null) {
            bracketEdgeStyleDescriptionItemProvider.dispose();
        }
    }

}
