/*******************************************************************************
 * Copyright (c) 2007-2013 THALES GLOBAL SERVICES.
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
package org.eclipse.sirius.diagram.sequence.template.provider;

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
import org.eclipse.sirius.diagram.sequence.template.util.TemplateAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers. The adapters generated by this
 * factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}. The adapters
 * also support Eclipse property sheets. Note that most of the adapters are shared among multiple instances. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class TemplateItemProviderAdapterFactory extends TemplateAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
    public TemplateItemProviderAdapterFactory() {
        supportedTypes.add(IEditingDomainItemProvider.class);
        supportedTypes.add(IStructuredItemContentProvider.class);
        supportedTypes.add(ITreeItemContentProvider.class);
        supportedTypes.add(IItemLabelProvider.class);
        supportedTypes.add(IItemPropertySource.class);
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.diagram.sequence.template.TSequenceDiagram} instances. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    protected TSequenceDiagramItemProvider tSequenceDiagramItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.diagram.sequence.template.TSequenceDiagram}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createTSequenceDiagramAdapter() {
        if (tSequenceDiagramItemProvider == null) {
            tSequenceDiagramItemProvider = new TSequenceDiagramItemProvider(this);
        }

        return tSequenceDiagramItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.diagram.sequence.template.TLifelineMapping} instances. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    protected TLifelineMappingItemProvider tLifelineMappingItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.diagram.sequence.template.TLifelineMapping}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createTLifelineMappingAdapter() {
        if (tLifelineMappingItemProvider == null) {
            tLifelineMappingItemProvider = new TLifelineMappingItemProvider(this);
        }

        return tLifelineMappingItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.diagram.sequence.template.TLifelineStyle} instances. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    protected TLifelineStyleItemProvider tLifelineStyleItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.diagram.sequence.template.TLifelineStyle}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createTLifelineStyleAdapter() {
        if (tLifelineStyleItemProvider == null) {
            tLifelineStyleItemProvider = new TLifelineStyleItemProvider(this);
        }

        return tLifelineStyleItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.diagram.sequence.template.TConditionalLifelineStyle} instances. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected TConditionalLifelineStyleItemProvider tConditionalLifelineStyleItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.diagram.sequence.template.TConditionalLifelineStyle}.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Adapter createTConditionalLifelineStyleAdapter() {
        if (tConditionalLifelineStyleItemProvider == null) {
            tConditionalLifelineStyleItemProvider = new TConditionalLifelineStyleItemProvider(this);
        }

        return tConditionalLifelineStyleItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.diagram.sequence.template.TTransformer} instances. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    protected TTransformerItemProvider tTransformerItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.diagram.sequence.template.TTransformer}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createTTransformerAdapter() {
        if (tTransformerItemProvider == null) {
            tTransformerItemProvider = new TTransformerItemProvider(this);
        }

        return tTransformerItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.diagram.sequence.template.TExecutionMapping} instances. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    protected TExecutionMappingItemProvider tExecutionMappingItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.diagram.sequence.template.TExecutionMapping}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createTExecutionMappingAdapter() {
        if (tExecutionMappingItemProvider == null) {
            tExecutionMappingItemProvider = new TExecutionMappingItemProvider(this);
        }

        return tExecutionMappingItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.diagram.sequence.template.TExecutionStyle} instances. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    protected TExecutionStyleItemProvider tExecutionStyleItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.diagram.sequence.template.TExecutionStyle}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createTExecutionStyleAdapter() {
        if (tExecutionStyleItemProvider == null) {
            tExecutionStyleItemProvider = new TExecutionStyleItemProvider(this);
        }

        return tExecutionStyleItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.diagram.sequence.template.TConditionalExecutionStyle} instances. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected TConditionalExecutionStyleItemProvider tConditionalExecutionStyleItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.diagram.sequence.template.TConditionalExecutionStyle}.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Adapter createTConditionalExecutionStyleAdapter() {
        if (tConditionalExecutionStyleItemProvider == null) {
            tConditionalExecutionStyleItemProvider = new TConditionalExecutionStyleItemProvider(this);
        }

        return tConditionalExecutionStyleItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.diagram.sequence.template.TMessageStyle} instances. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    protected TMessageStyleItemProvider tMessageStyleItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.diagram.sequence.template.TMessageStyle}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createTMessageStyleAdapter() {
        if (tMessageStyleItemProvider == null) {
            tMessageStyleItemProvider = new TMessageStyleItemProvider(this);
        }

        return tMessageStyleItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.diagram.sequence.template.TConditionalMessageStyle} instances. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected TConditionalMessageStyleItemProvider tConditionalMessageStyleItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.diagram.sequence.template.TConditionalMessageStyle}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createTConditionalMessageStyleAdapter() {
        if (tConditionalMessageStyleItemProvider == null) {
            tConditionalMessageStyleItemProvider = new TConditionalMessageStyleItemProvider(this);
        }

        return tConditionalMessageStyleItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.diagram.sequence.template.TBasicMessageMapping} instances. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    protected TBasicMessageMappingItemProvider tBasicMessageMappingItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.diagram.sequence.template.TBasicMessageMapping}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createTBasicMessageMappingAdapter() {
        if (tBasicMessageMappingItemProvider == null) {
            tBasicMessageMappingItemProvider = new TBasicMessageMappingItemProvider(this);
        }

        return tBasicMessageMappingItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.diagram.sequence.template.TReturnMessageMapping} instances. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected TReturnMessageMappingItemProvider tReturnMessageMappingItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.diagram.sequence.template.TReturnMessageMapping}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createTReturnMessageMappingAdapter() {
        if (tReturnMessageMappingItemProvider == null) {
            tReturnMessageMappingItemProvider = new TReturnMessageMappingItemProvider(this);
        }

        return tReturnMessageMappingItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.diagram.sequence.template.TCreationMessageMapping} instances. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected TCreationMessageMappingItemProvider tCreationMessageMappingItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.diagram.sequence.template.TCreationMessageMapping}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createTCreationMessageMappingAdapter() {
        if (tCreationMessageMappingItemProvider == null) {
            tCreationMessageMappingItemProvider = new TCreationMessageMappingItemProvider(this);
        }

        return tCreationMessageMappingItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.diagram.sequence.template.TDestructionMessageMapping} instances. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected TDestructionMessageMappingItemProvider tDestructionMessageMappingItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.diagram.sequence.template.TDestructionMessageMapping}.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Adapter createTDestructionMessageMappingAdapter() {
        if (tDestructionMessageMappingItemProvider == null) {
            tDestructionMessageMappingItemProvider = new TDestructionMessageMappingItemProvider(this);
        }

        return tDestructionMessageMappingItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.diagram.sequence.template.TAbstractMapping} instances. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    protected TAbstractMappingItemProvider tAbstractMappingItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.diagram.sequence.template.TAbstractMapping}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createTAbstractMappingAdapter() {
        if (tAbstractMappingItemProvider == null) {
            tAbstractMappingItemProvider = new TAbstractMappingItemProvider(this);
        }

        return tAbstractMappingItemProvider;
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
        if (tTransformerItemProvider != null) {
            tTransformerItemProvider.dispose();
        }
        if (tAbstractMappingItemProvider != null) {
            tAbstractMappingItemProvider.dispose();
        }
        if (tSequenceDiagramItemProvider != null) {
            tSequenceDiagramItemProvider.dispose();
        }
        if (tLifelineMappingItemProvider != null) {
            tLifelineMappingItemProvider.dispose();
        }
        if (tLifelineStyleItemProvider != null) {
            tLifelineStyleItemProvider.dispose();
        }
        if (tConditionalLifelineStyleItemProvider != null) {
            tConditionalLifelineStyleItemProvider.dispose();
        }
        if (tExecutionMappingItemProvider != null) {
            tExecutionMappingItemProvider.dispose();
        }
        if (tExecutionStyleItemProvider != null) {
            tExecutionStyleItemProvider.dispose();
        }
        if (tConditionalExecutionStyleItemProvider != null) {
            tConditionalExecutionStyleItemProvider.dispose();
        }
        if (tMessageStyleItemProvider != null) {
            tMessageStyleItemProvider.dispose();
        }
        if (tConditionalMessageStyleItemProvider != null) {
            tConditionalMessageStyleItemProvider.dispose();
        }
        if (tBasicMessageMappingItemProvider != null) {
            tBasicMessageMappingItemProvider.dispose();
        }
        if (tReturnMessageMappingItemProvider != null) {
            tReturnMessageMappingItemProvider.dispose();
        }
        if (tCreationMessageMappingItemProvider != null) {
            tCreationMessageMappingItemProvider.dispose();
        }
        if (tDestructionMessageMappingItemProvider != null) {
            tDestructionMessageMappingItemProvider.dispose();
        }
    }

}
