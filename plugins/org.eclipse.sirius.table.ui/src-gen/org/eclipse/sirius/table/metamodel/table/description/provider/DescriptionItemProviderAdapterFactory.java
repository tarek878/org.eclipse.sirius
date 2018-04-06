/*******************************************************************************
 * Copyright (c) 2007-2016 THALES GLOBAL SERVICES.
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
package org.eclipse.sirius.table.metamodel.table.description.provider;

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
import org.eclipse.sirius.table.metamodel.table.description.util.DescriptionAdapterFactory;
import org.eclipse.sirius.table.ui.business.internal.description.provider.CrossTableDescriptionItemProviderSpec;
import org.eclipse.sirius.table.ui.business.internal.description.provider.EditionTableDescriptionItemProviderSpec;

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
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.table.metamodel.table.description.EditionTableDescription} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected EditionTableDescriptionItemProvider editionTableDescriptionItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.eclipse.sirius.table.metamodel.table.description.EditionTableDescription} . <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @not-generated
     */
    @Override
    public Adapter createEditionTableDescriptionAdapter() {
        if (editionTableDescriptionItemProvider == null) {
            editionTableDescriptionItemProvider = new EditionTableDescriptionItemProviderSpec(this);
        }

        return editionTableDescriptionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.table.metamodel.table.description.CrossTableDescription} instances. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected CrossTableDescriptionItemProvider crossTableDescriptionItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.table.metamodel.table.description.CrossTableDescription}
     * . <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @not-generated
     */
    @Override
    public Adapter createCrossTableDescriptionAdapter() {
        if (crossTableDescriptionItemProvider == null) {
            crossTableDescriptionItemProvider = new CrossTableDescriptionItemProviderSpec(this);
        }

        return crossTableDescriptionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.table.metamodel.table.description.TableMapping} instances. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected TableMappingItemProvider tableMappingItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.table.metamodel.table.description.TableMapping}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createTableMappingAdapter() {
        if (tableMappingItemProvider == null) {
            tableMappingItemProvider = new TableMappingItemProvider(this);
        }

        return tableMappingItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.table.metamodel.table.description.LineMapping} instances. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected LineMappingItemProvider lineMappingItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.table.metamodel.table.description.LineMapping}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createLineMappingAdapter() {
        if (lineMappingItemProvider == null) {
            lineMappingItemProvider = new LineMappingItemProvider(this);
        }

        return lineMappingItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.table.metamodel.table.description.ColumnMapping} instances. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected ColumnMappingItemProvider columnMappingItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.table.metamodel.table.description.ColumnMapping}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createColumnMappingAdapter() {
        if (columnMappingItemProvider == null) {
            columnMappingItemProvider = new ColumnMappingItemProvider(this);
        }

        return columnMappingItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.table.metamodel.table.description.ElementColumnMapping} instances. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ElementColumnMappingItemProvider elementColumnMappingItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.table.metamodel.table.description.ElementColumnMapping}.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createElementColumnMappingAdapter() {
        if (elementColumnMappingItemProvider == null) {
            elementColumnMappingItemProvider = new ElementColumnMappingItemProvider(this);
        }

        return elementColumnMappingItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.table.metamodel.table.description.FeatureColumnMapping} instances. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected FeatureColumnMappingItemProvider featureColumnMappingItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.table.metamodel.table.description.FeatureColumnMapping}.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createFeatureColumnMappingAdapter() {
        if (featureColumnMappingItemProvider == null) {
            featureColumnMappingItemProvider = new FeatureColumnMappingItemProvider(this);
        }

        return featureColumnMappingItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.table.metamodel.table.description.CellUpdater} instances. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected CellUpdaterItemProvider cellUpdaterItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.table.metamodel.table.description.CellUpdater}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createCellUpdaterAdapter() {
        if (cellUpdaterItemProvider == null) {
            cellUpdaterItemProvider = new CellUpdaterItemProvider(this);
        }

        return cellUpdaterItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.table.metamodel.table.description.IntersectionMapping} instances. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected IntersectionMappingItemProvider intersectionMappingItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.table.metamodel.table.description.IntersectionMapping}.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createIntersectionMappingAdapter() {
        if (intersectionMappingItemProvider == null) {
            intersectionMappingItemProvider = new IntersectionMappingItemProvider(this);
        }

        return intersectionMappingItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.table.metamodel.table.description.TableTool} instances. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected TableToolItemProvider tableToolItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.table.metamodel.table.description.TableTool}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createTableToolAdapter() {
        if (tableToolItemProvider == null) {
            tableToolItemProvider = new TableToolItemProvider(this);
        }

        return tableToolItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.table.metamodel.table.description.LabelEditTool} instances. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected LabelEditToolItemProvider labelEditToolItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.table.metamodel.table.description.LabelEditTool}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createLabelEditToolAdapter() {
        if (labelEditToolItemProvider == null) {
            labelEditToolItemProvider = new LabelEditToolItemProvider(this);
        }

        return labelEditToolItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.table.metamodel.table.description.CreateColumnTool} instances. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected CreateColumnToolItemProvider createColumnToolItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.table.metamodel.table.description.CreateColumnTool}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createCreateColumnToolAdapter() {
        if (createColumnToolItemProvider == null) {
            createColumnToolItemProvider = new CreateColumnToolItemProvider(this);
        }

        return createColumnToolItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.table.metamodel.table.description.CreateCrossColumnTool} instances. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected CreateCrossColumnToolItemProvider createCrossColumnToolItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.table.metamodel.table.description.CreateCrossColumnTool}.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createCreateCrossColumnToolAdapter() {
        if (createCrossColumnToolItemProvider == null) {
            createCrossColumnToolItemProvider = new CreateCrossColumnToolItemProvider(this);
        }

        return createCrossColumnToolItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.table.metamodel.table.description.CreateLineTool} instances. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected CreateLineToolItemProvider createLineToolItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.table.metamodel.table.description.CreateLineTool}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createCreateLineToolAdapter() {
        if (createLineToolItemProvider == null) {
            createLineToolItemProvider = new CreateLineToolItemProvider(this);
        }

        return createLineToolItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.table.metamodel.table.description.CreateCellTool} instances. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected CreateCellToolItemProvider createCellToolItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.table.metamodel.table.description.CreateCellTool}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createCreateCellToolAdapter() {
        if (createCellToolItemProvider == null) {
            createCellToolItemProvider = new CreateCellToolItemProvider(this);
        }

        return createCellToolItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.table.metamodel.table.description.DeleteColumnTool} instances. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected DeleteColumnToolItemProvider deleteColumnToolItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.table.metamodel.table.description.DeleteColumnTool}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createDeleteColumnToolAdapter() {
        if (deleteColumnToolItemProvider == null) {
            deleteColumnToolItemProvider = new DeleteColumnToolItemProvider(this);
        }

        return deleteColumnToolItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.table.metamodel.table.description.DeleteLineTool} instances. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected DeleteLineToolItemProvider deleteLineToolItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.table.metamodel.table.description.DeleteLineTool}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createDeleteLineToolAdapter() {
        if (deleteLineToolItemProvider == null) {
            deleteLineToolItemProvider = new DeleteLineToolItemProvider(this);
        }

        return deleteLineToolItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.table.metamodel.table.description.ForegroundStyleDescription} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ForegroundStyleDescriptionItemProvider foregroundStyleDescriptionItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.eclipse.sirius.table.metamodel.table.description.ForegroundStyleDescription}. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createForegroundStyleDescriptionAdapter() {
        if (foregroundStyleDescriptionItemProvider == null) {
            foregroundStyleDescriptionItemProvider = new ForegroundStyleDescriptionItemProvider(this);
        }

        return foregroundStyleDescriptionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.table.metamodel.table.description.BackgroundStyleDescription} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected BackgroundStyleDescriptionItemProvider backgroundStyleDescriptionItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.eclipse.sirius.table.metamodel.table.description.BackgroundStyleDescription}. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createBackgroundStyleDescriptionAdapter() {
        if (backgroundStyleDescriptionItemProvider == null) {
            backgroundStyleDescriptionItemProvider = new BackgroundStyleDescriptionItemProvider(this);
        }

        return backgroundStyleDescriptionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.table.metamodel.table.description.ForegroundConditionalStyle} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ForegroundConditionalStyleItemProvider foregroundConditionalStyleItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.eclipse.sirius.table.metamodel.table.description.ForegroundConditionalStyle}. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createForegroundConditionalStyleAdapter() {
        if (foregroundConditionalStyleItemProvider == null) {
            foregroundConditionalStyleItemProvider = new ForegroundConditionalStyleItemProvider(this);
        }

        return foregroundConditionalStyleItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.table.metamodel.table.description.BackgroundConditionalStyle} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected BackgroundConditionalStyleItemProvider backgroundConditionalStyleItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.eclipse.sirius.table.metamodel.table.description.BackgroundConditionalStyle}. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createBackgroundConditionalStyleAdapter() {
        if (backgroundConditionalStyleItemProvider == null) {
            backgroundConditionalStyleItemProvider = new BackgroundConditionalStyleItemProvider(this);
        }

        return backgroundConditionalStyleItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.table.metamodel.table.description.TableVariable} instances. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected TableVariableItemProvider tableVariableItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.table.metamodel.table.description.TableVariable}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createTableVariableAdapter() {
        if (tableVariableItemProvider == null) {
            tableVariableItemProvider = new TableVariableItemProvider(this);
        }

        return tableVariableItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.table.metamodel.table.description.TableCreationDescription} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected TableCreationDescriptionItemProvider tableCreationDescriptionItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.eclipse.sirius.table.metamodel.table.description.TableCreationDescription}. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createTableCreationDescriptionAdapter() {
        if (tableCreationDescriptionItemProvider == null) {
            tableCreationDescriptionItemProvider = new TableCreationDescriptionItemProvider(this);
        }

        return tableCreationDescriptionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.table.metamodel.table.description.TableNavigationDescription} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected TableNavigationDescriptionItemProvider tableNavigationDescriptionItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.eclipse.sirius.table.metamodel.table.description.TableNavigationDescription}. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createTableNavigationDescriptionAdapter() {
        if (tableNavigationDescriptionItemProvider == null) {
            tableNavigationDescriptionItemProvider = new TableNavigationDescriptionItemProvider(this);
        }

        return tableNavigationDescriptionItemProvider;
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
        if (editionTableDescriptionItemProvider != null) {
            editionTableDescriptionItemProvider.dispose();
        }
        if (crossTableDescriptionItemProvider != null) {
            crossTableDescriptionItemProvider.dispose();
        }
        if (tableMappingItemProvider != null) {
            tableMappingItemProvider.dispose();
        }
        if (lineMappingItemProvider != null) {
            lineMappingItemProvider.dispose();
        }
        if (columnMappingItemProvider != null) {
            columnMappingItemProvider.dispose();
        }
        if (elementColumnMappingItemProvider != null) {
            elementColumnMappingItemProvider.dispose();
        }
        if (featureColumnMappingItemProvider != null) {
            featureColumnMappingItemProvider.dispose();
        }
        if (cellUpdaterItemProvider != null) {
            cellUpdaterItemProvider.dispose();
        }
        if (intersectionMappingItemProvider != null) {
            intersectionMappingItemProvider.dispose();
        }
        if (tableToolItemProvider != null) {
            tableToolItemProvider.dispose();
        }
        if (labelEditToolItemProvider != null) {
            labelEditToolItemProvider.dispose();
        }
        if (createColumnToolItemProvider != null) {
            createColumnToolItemProvider.dispose();
        }
        if (createCrossColumnToolItemProvider != null) {
            createCrossColumnToolItemProvider.dispose();
        }
        if (createLineToolItemProvider != null) {
            createLineToolItemProvider.dispose();
        }
        if (createCellToolItemProvider != null) {
            createCellToolItemProvider.dispose();
        }
        if (deleteColumnToolItemProvider != null) {
            deleteColumnToolItemProvider.dispose();
        }
        if (deleteLineToolItemProvider != null) {
            deleteLineToolItemProvider.dispose();
        }
        if (foregroundStyleDescriptionItemProvider != null) {
            foregroundStyleDescriptionItemProvider.dispose();
        }
        if (backgroundStyleDescriptionItemProvider != null) {
            backgroundStyleDescriptionItemProvider.dispose();
        }
        if (foregroundConditionalStyleItemProvider != null) {
            foregroundConditionalStyleItemProvider.dispose();
        }
        if (backgroundConditionalStyleItemProvider != null) {
            backgroundConditionalStyleItemProvider.dispose();
        }
        if (tableVariableItemProvider != null) {
            tableVariableItemProvider.dispose();
        }
        if (tableCreationDescriptionItemProvider != null) {
            tableCreationDescriptionItemProvider.dispose();
        }
        if (tableNavigationDescriptionItemProvider != null) {
            tableNavigationDescriptionItemProvider.dispose();
        }
    }

}
