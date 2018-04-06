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
package org.eclipse.sirius.diagram.sequence.description.tool.provider;

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
import org.eclipse.sirius.diagram.sequence.description.tool.util.ToolAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers. The adapters generated by this
 * factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}. The adapters
 * also support Eclipse property sheets. Note that most of the adapters are shared among multiple instances. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class ToolItemProviderAdapterFactory extends ToolAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
    public ToolItemProviderAdapterFactory() {
        supportedTypes.add(IEditingDomainItemProvider.class);
        supportedTypes.add(IStructuredItemContentProvider.class);
        supportedTypes.add(ITreeItemContentProvider.class);
        supportedTypes.add(IItemLabelProvider.class);
        supportedTypes.add(IItemPropertySource.class);
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.diagram.sequence.description.tool.SequenceDiagramToolDescription} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected SequenceDiagramToolDescriptionItemProvider sequenceDiagramToolDescriptionItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.eclipse.sirius.diagram.sequence.description.tool.SequenceDiagramToolDescription}. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Adapter createSequenceDiagramToolDescriptionAdapter() {
        if (sequenceDiagramToolDescriptionItemProvider == null) {
            sequenceDiagramToolDescriptionItemProvider = new SequenceDiagramToolDescriptionItemProvider(this);
        }

        return sequenceDiagramToolDescriptionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.diagram.sequence.description.tool.InstanceRoleCreationTool} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected InstanceRoleCreationToolItemProvider instanceRoleCreationToolItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.eclipse.sirius.diagram.sequence.description.tool.InstanceRoleCreationTool}. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Adapter createInstanceRoleCreationToolAdapter() {
        if (instanceRoleCreationToolItemProvider == null) {
            instanceRoleCreationToolItemProvider = new InstanceRoleCreationToolItemProvider(this);
        }

        return instanceRoleCreationToolItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.diagram.sequence.description.tool.LifelineCreationTool} instances. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected LifelineCreationToolItemProvider lifelineCreationToolItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.diagram.sequence.description.tool.LifelineCreationTool}.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Adapter createLifelineCreationToolAdapter() {
        if (lifelineCreationToolItemProvider == null) {
            lifelineCreationToolItemProvider = new LifelineCreationToolItemProvider(this);
        }

        return lifelineCreationToolItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.diagram.sequence.description.tool.MessageCreationTool} instances. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected MessageCreationToolItemProvider messageCreationToolItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.diagram.sequence.description.tool.MessageCreationTool}.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Adapter createMessageCreationToolAdapter() {
        if (messageCreationToolItemProvider == null) {
            messageCreationToolItemProvider = new MessageCreationToolItemProvider(this);
        }

        return messageCreationToolItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.diagram.sequence.description.tool.ExecutionCreationTool} instances. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected ExecutionCreationToolItemProvider executionCreationToolItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.diagram.sequence.description.tool.ExecutionCreationTool}.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Adapter createExecutionCreationToolAdapter() {
        if (executionCreationToolItemProvider == null) {
            executionCreationToolItemProvider = new ExecutionCreationToolItemProvider(this);
        }

        return executionCreationToolItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.diagram.sequence.description.tool.StateCreationTool} instances. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected StateCreationToolItemProvider stateCreationToolItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.diagram.sequence.description.tool.StateCreationTool}.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Adapter createStateCreationToolAdapter() {
        if (stateCreationToolItemProvider == null) {
            stateCreationToolItemProvider = new StateCreationToolItemProvider(this);
        }

        return stateCreationToolItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.diagram.sequence.description.tool.ReorderTool} instances. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    protected ReorderToolItemProvider reorderToolItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.diagram.sequence.description.tool.ReorderTool}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createReorderToolAdapter() {
        if (reorderToolItemProvider == null) {
            reorderToolItemProvider = new ReorderToolItemProvider(this);
        }

        return reorderToolItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.diagram.sequence.description.tool.InstanceRoleReorderTool} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected InstanceRoleReorderToolItemProvider instanceRoleReorderToolItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.eclipse.sirius.diagram.sequence.description.tool.InstanceRoleReorderTool}. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Adapter createInstanceRoleReorderToolAdapter() {
        if (instanceRoleReorderToolItemProvider == null) {
            instanceRoleReorderToolItemProvider = new InstanceRoleReorderToolItemProvider(this);
        }

        return instanceRoleReorderToolItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.diagram.sequence.description.tool.ObservationPointCreationTool} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ObservationPointCreationToolItemProvider observationPointCreationToolItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.eclipse.sirius.diagram.sequence.description.tool.ObservationPointCreationTool}. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Adapter createObservationPointCreationToolAdapter() {
        if (observationPointCreationToolItemProvider == null) {
            observationPointCreationToolItemProvider = new ObservationPointCreationToolItemProvider(this);
        }

        return observationPointCreationToolItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.diagram.sequence.description.tool.InteractionUseCreationTool} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected InteractionUseCreationToolItemProvider interactionUseCreationToolItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.eclipse.sirius.diagram.sequence.description.tool.InteractionUseCreationTool}. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Adapter createInteractionUseCreationToolAdapter() {
        if (interactionUseCreationToolItemProvider == null) {
            interactionUseCreationToolItemProvider = new InteractionUseCreationToolItemProvider(this);
        }

        return interactionUseCreationToolItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.diagram.sequence.description.tool.CombinedFragmentCreationTool} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected CombinedFragmentCreationToolItemProvider combinedFragmentCreationToolItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.eclipse.sirius.diagram.sequence.description.tool.CombinedFragmentCreationTool}. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Adapter createCombinedFragmentCreationToolAdapter() {
        if (combinedFragmentCreationToolItemProvider == null) {
            combinedFragmentCreationToolItemProvider = new CombinedFragmentCreationToolItemProvider(this);
        }

        return combinedFragmentCreationToolItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.diagram.sequence.description.tool.OperandCreationTool} instances. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected OperandCreationToolItemProvider operandCreationToolItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.diagram.sequence.description.tool.OperandCreationTool}.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Adapter createOperandCreationToolAdapter() {
        if (operandCreationToolItemProvider == null) {
            operandCreationToolItemProvider = new OperandCreationToolItemProvider(this);
        }

        return operandCreationToolItemProvider;
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
        if (sequenceDiagramToolDescriptionItemProvider != null) {
            sequenceDiagramToolDescriptionItemProvider.dispose();
        }
        if (instanceRoleCreationToolItemProvider != null) {
            instanceRoleCreationToolItemProvider.dispose();
        }
        if (lifelineCreationToolItemProvider != null) {
            lifelineCreationToolItemProvider.dispose();
        }
        if (messageCreationToolItemProvider != null) {
            messageCreationToolItemProvider.dispose();
        }
        if (executionCreationToolItemProvider != null) {
            executionCreationToolItemProvider.dispose();
        }
        if (stateCreationToolItemProvider != null) {
            stateCreationToolItemProvider.dispose();
        }
        if (interactionUseCreationToolItemProvider != null) {
            interactionUseCreationToolItemProvider.dispose();
        }
        if (combinedFragmentCreationToolItemProvider != null) {
            combinedFragmentCreationToolItemProvider.dispose();
        }
        if (operandCreationToolItemProvider != null) {
            operandCreationToolItemProvider.dispose();
        }
        if (observationPointCreationToolItemProvider != null) {
            observationPointCreationToolItemProvider.dispose();
        }
        if (reorderToolItemProvider != null) {
            reorderToolItemProvider.dispose();
        }
        if (instanceRoleReorderToolItemProvider != null) {
            instanceRoleReorderToolItemProvider.dispose();
        }
    }

}
