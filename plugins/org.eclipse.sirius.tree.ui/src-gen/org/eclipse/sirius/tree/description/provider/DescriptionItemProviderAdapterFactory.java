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
package org.eclipse.sirius.tree.description.provider;

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
import org.eclipse.sirius.tree.description.util.DescriptionAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers. The adapters generated by this
 * factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}. The adapters
 * also support Eclipse property sheets. Note that most of the adapters are shared among multiple instances. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class DescriptionItemProviderAdapterFactory extends DescriptionAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
    public DescriptionItemProviderAdapterFactory() {
        supportedTypes.add(IEditingDomainItemProvider.class);
        supportedTypes.add(IStructuredItemContentProvider.class);
        supportedTypes.add(ITreeItemContentProvider.class);
        supportedTypes.add(IItemLabelProvider.class);
        supportedTypes.add(IItemPropertySource.class);
    }

    /**
     * This keeps track of the one adapter used for all {@link org.eclipse.sirius.tree.description.TreeDescription}
     * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected TreeDescriptionItemProvider treeDescriptionItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.tree.description.TreeDescription}. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Adapter createTreeDescriptionAdapter() {
        if (treeDescriptionItemProvider == null) {
            treeDescriptionItemProvider = new TreeDescriptionItemProvider(this);
        }

        return treeDescriptionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.eclipse.sirius.tree.description.TreeItemMapping}
     * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected TreeItemMappingItemProvider treeItemMappingItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.tree.description.TreeItemMapping}. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Adapter createTreeItemMappingAdapter() {
        if (treeItemMappingItemProvider == null) {
            treeItemMappingItemProvider = new TreeItemMappingItemProvider(this);
        }

        return treeItemMappingItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.tree.description.TreeItemStyleDescription} instances. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    protected TreeItemStyleDescriptionItemProvider treeItemStyleDescriptionItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.tree.description.TreeItemStyleDescription}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createTreeItemStyleDescriptionAdapter() {
        if (treeItemStyleDescriptionItemProvider == null) {
            treeItemStyleDescriptionItemProvider = new TreeItemStyleDescriptionItemProvider(this);
        }

        return treeItemStyleDescriptionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.tree.description.ConditionalTreeItemStyleDescription} instances. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected ConditionalTreeItemStyleDescriptionItemProvider conditionalTreeItemStyleDescriptionItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.tree.description.ConditionalTreeItemStyleDescription}.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Adapter createConditionalTreeItemStyleDescriptionAdapter() {
        if (conditionalTreeItemStyleDescriptionItemProvider == null) {
            conditionalTreeItemStyleDescriptionItemProvider = new ConditionalTreeItemStyleDescriptionItemProvider(this);
        }

        return conditionalTreeItemStyleDescriptionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.eclipse.sirius.tree.description.TreeItemDragTool}
     * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected TreeItemDragToolItemProvider treeItemDragToolItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.tree.description.TreeItemDragTool}. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Adapter createTreeItemDragToolAdapter() {
        if (treeItemDragToolItemProvider == null) {
            treeItemDragToolItemProvider = new TreeItemDragToolItemProvider(this);
        }

        return treeItemDragToolItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.tree.description.TreeItemContainerDropTool} instances. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    protected TreeItemContainerDropToolItemProvider treeItemContainerDropToolItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.tree.description.TreeItemContainerDropTool}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createTreeItemContainerDropToolAdapter() {
        if (treeItemContainerDropToolItemProvider == null) {
            treeItemContainerDropToolItemProvider = new TreeItemContainerDropToolItemProvider(this);
        }

        return treeItemContainerDropToolItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.eclipse.sirius.tree.description.TreeItemCreationTool}
     * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected TreeItemCreationToolItemProvider treeItemCreationToolItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.tree.description.TreeItemCreationTool}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createTreeItemCreationToolAdapter() {
        if (treeItemCreationToolItemProvider == null) {
            treeItemCreationToolItemProvider = new TreeItemCreationToolItemProvider(this);
        }

        return treeItemCreationToolItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.eclipse.sirius.tree.description.TreeItemEditionTool}
     * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected TreeItemEditionToolItemProvider treeItemEditionToolItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.tree.description.TreeItemEditionTool}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createTreeItemEditionToolAdapter() {
        if (treeItemEditionToolItemProvider == null) {
            treeItemEditionToolItemProvider = new TreeItemEditionToolItemProvider(this);
        }

        return treeItemEditionToolItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.eclipse.sirius.tree.description.TreeItemDeletionTool}
     * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected TreeItemDeletionToolItemProvider treeItemDeletionToolItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.tree.description.TreeItemDeletionTool}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createTreeItemDeletionToolAdapter() {
        if (treeItemDeletionToolItemProvider == null) {
            treeItemDeletionToolItemProvider = new TreeItemDeletionToolItemProvider(this);
        }

        return treeItemDeletionToolItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.tree.description.TreeCreationDescription} instances. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    protected TreeCreationDescriptionItemProvider treeCreationDescriptionItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.tree.description.TreeCreationDescription}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createTreeCreationDescriptionAdapter() {
        if (treeCreationDescriptionItemProvider == null) {
            treeCreationDescriptionItemProvider = new TreeCreationDescriptionItemProvider(this);
        }

        return treeCreationDescriptionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.tree.description.TreeNavigationDescription} instances. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    protected TreeNavigationDescriptionItemProvider treeNavigationDescriptionItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.tree.description.TreeNavigationDescription}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createTreeNavigationDescriptionAdapter() {
        if (treeNavigationDescriptionItemProvider == null) {
            treeNavigationDescriptionItemProvider = new TreeNavigationDescriptionItemProvider(this);
        }

        return treeNavigationDescriptionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.eclipse.sirius.tree.description.TreeMapping}
     * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected TreeMappingItemProvider treeMappingItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.tree.description.TreeMapping}. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Adapter createTreeMappingAdapter() {
        if (treeMappingItemProvider == null) {
            treeMappingItemProvider = new TreeMappingItemProvider(this);
        }

        return treeMappingItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.eclipse.sirius.tree.description.StyleUpdater}
     * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected StyleUpdaterItemProvider styleUpdaterItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.tree.description.StyleUpdater}. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Adapter createStyleUpdaterAdapter() {
        if (styleUpdaterItemProvider == null) {
            styleUpdaterItemProvider = new StyleUpdaterItemProvider(this);
        }

        return styleUpdaterItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.eclipse.sirius.tree.description.TreeVariable}
     * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected TreeVariableItemProvider treeVariableItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.tree.description.TreeVariable}. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Adapter createTreeVariableAdapter() {
        if (treeVariableItemProvider == null) {
            treeVariableItemProvider = new TreeVariableItemProvider(this);
        }

        return treeVariableItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.eclipse.sirius.tree.description.TreeItemUpdater}
     * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected TreeItemUpdaterItemProvider treeItemUpdaterItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.tree.description.TreeItemUpdater}. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Adapter createTreeItemUpdaterAdapter() {
        if (treeItemUpdaterItemProvider == null) {
            treeItemUpdaterItemProvider = new TreeItemUpdaterItemProvider(this);
        }

        return treeItemUpdaterItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.tree.description.PrecedingSiblingsVariables} instances. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    protected PrecedingSiblingsVariablesItemProvider precedingSiblingsVariablesItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.tree.description.PrecedingSiblingsVariables}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createPrecedingSiblingsVariablesAdapter() {
        if (precedingSiblingsVariablesItemProvider == null) {
            precedingSiblingsVariablesItemProvider = new PrecedingSiblingsVariablesItemProvider(this);
        }

        return precedingSiblingsVariablesItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.eclipse.sirius.tree.description.TreePopupMenu}
     * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected TreePopupMenuItemProvider treePopupMenuItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.tree.description.TreePopupMenu}. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Adapter createTreePopupMenuAdapter() {
        if (treePopupMenuItemProvider == null) {
            treePopupMenuItemProvider = new TreePopupMenuItemProvider(this);
        }

        return treePopupMenuItemProvider;
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
        if (treeDescriptionItemProvider != null) {
            treeDescriptionItemProvider.dispose();
        }
        if (treeItemMappingItemProvider != null) {
            treeItemMappingItemProvider.dispose();
        }
        if (treeItemStyleDescriptionItemProvider != null) {
            treeItemStyleDescriptionItemProvider.dispose();
        }
        if (conditionalTreeItemStyleDescriptionItemProvider != null) {
            conditionalTreeItemStyleDescriptionItemProvider.dispose();
        }
        if (treeItemDragToolItemProvider != null) {
            treeItemDragToolItemProvider.dispose();
        }
        if (treeItemContainerDropToolItemProvider != null) {
            treeItemContainerDropToolItemProvider.dispose();
        }
        if (treeItemCreationToolItemProvider != null) {
            treeItemCreationToolItemProvider.dispose();
        }
        if (treeItemEditionToolItemProvider != null) {
            treeItemEditionToolItemProvider.dispose();
        }
        if (treeItemDeletionToolItemProvider != null) {
            treeItemDeletionToolItemProvider.dispose();
        }
        if (treeCreationDescriptionItemProvider != null) {
            treeCreationDescriptionItemProvider.dispose();
        }
        if (treeNavigationDescriptionItemProvider != null) {
            treeNavigationDescriptionItemProvider.dispose();
        }
        if (treeMappingItemProvider != null) {
            treeMappingItemProvider.dispose();
        }
        if (styleUpdaterItemProvider != null) {
            styleUpdaterItemProvider.dispose();
        }
        if (treeVariableItemProvider != null) {
            treeVariableItemProvider.dispose();
        }
        if (treeItemUpdaterItemProvider != null) {
            treeItemUpdaterItemProvider.dispose();
        }
        if (precedingSiblingsVariablesItemProvider != null) {
            precedingSiblingsVariablesItemProvider.dispose();
        }
        if (treePopupMenuItemProvider != null) {
            treePopupMenuItemProvider.dispose();
        }
    }

}
