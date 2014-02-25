/*******************************************************************************
 * Copyright (c) 2009, 2009 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.sirius.diagram.ui.business.api.view;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.ArrangeRequest;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.diagram.AbstractDNode;
import org.eclipse.sirius.diagram.DEdge;
import org.eclipse.sirius.diagram.ui.business.internal.view.AbstractLayoutData;
import org.eclipse.sirius.diagram.ui.business.internal.view.EdgeLabelLayoutData;
import org.eclipse.sirius.diagram.ui.business.internal.view.EdgeLayoutData;
import org.eclipse.sirius.diagram.ui.business.internal.view.LayoutData;
import org.eclipse.sirius.diagram.ui.business.internal.view.SiriusLayoutDataManagerImpl;
import org.eclipse.sirius.ext.base.Option;

/**
 * Manage the AbstractLayoutData during node creation or drag'n'drop. LayoutData
 * are removed after a OperationHistoryEvent#DONE.
 * 
 * @author <a href="mailto:laurent.redor@obeo.fr">Laurent Redor</a>
 * @since 0.9.0
 */
public interface SiriusLayoutDataManager {
    /**
     * The shared instance.
     */
    SiriusLayoutDataManager INSTANCE = SiriusLayoutDataManagerImpl.init();

    /**
     * Padding for several created view in same time.
     */
    int PADDING = 30;

    /**
     * Add a new AbstractLayoutData of this SiriusLayoutDataManagerImpl.
     * 
     * @param layoutData
     *            A new LayoutData
     */
    void addData(final AbstractLayoutData layoutData);

    /**
     * Search recursively in all the LayoutData is there is one which have the
     * element for target.
     * 
     * @param node
     *            The search element
     * @return the corresponding LayoutData or null if not found.
     */
    LayoutData getData(final AbstractDNode node);

    /**
     * Search recursively in all the LayoutData is there is one which have the
     * node for target.
     * 
     * @param node
     *            The search element
     * @param searchForParent
     *            true if the data must be retrieve from the node parent (the
     *            data must be retrieve from parent for a creation of an
     *            object).
     * @return the corresponding LayoutData or null if not found.
     */
    LayoutData getData(final AbstractDNode node, final boolean searchForParent);

    /**
     * Search recursively in all the LayoutData is there is one which have the
     * edge for target.
     * 
     * @param edge
     *            The search element
     * @param searchParent
     *            true if the data must be retrieve from the node parent (the
     *            data must be retrieve from parent for a creation of an object)
     * @return the corresponding EdgeLayoutData or null if not found.
     */
    EdgeLayoutData getData(final DEdge edge, final boolean searchParent);

    /**
     * Get the Adapter marker to mark GMF View as not to arrange.
     * 
     * @return the Adapter marker to mark GMF View as not to arrange
     */
    Adapter getAdapterMarker();

    /**
     * Get the center Adapter marker to mark GMF View as to arrange in the
     * center of container.
     * 
     * @return the center Adapter marker to mark GMF View as to arrange in the
     *         center of container
     */
    Adapter getCenterAdapterMarker();

    /**
     * Search recursively in all the LayoutData is there is one which have the
     * edge for target.
     * 
     * @param edge
     *            The search element
     * @return the corresponding EdgeLayoutData or null if not found.
     */
    EdgeLabelLayoutData getLabelData(final DEdge edge);

    /**
     * Initializes a new transactional command with the editing domain in which
     * the marker adapter is added to the GMF view. This marker is added to
     * avoid the arrange of the new view that are already layout by the
     * SiriusLayoutData.
     * 
     * @param domain
     *            my editing domain
     * @param viewAdapter
     *            A {@link IAdaptable} of a {@link View}
     * @return A new transactional command.
     */
    AbstractTransactionalCommand getAddAdapterMakerCommand(final TransactionalEditingDomain domain, final IAdaptable viewAdapter);

    /**
     * Initializes a new transactional command with the editing domain in which
     * the marker adapter is added to the GMF view. This marker is added to
     * launch the arrange of the new view using center of the container.
     * 
     * @param domain
     *            my editing domain
     * @param viewAdapter
     *            A {@link IAdaptable} of a {@link View}
     * @return A new transactional command.
     */
    AbstractTransactionalCommand getAddCenterAdapterMakerCommand(final TransactionalEditingDomain domain, final IAdaptable viewAdapter);

    /**
     * Initializes a new transactional command with the editing domain in which
     * the marker adapter is added to the GMF view. This marker is added to
     * launch the arrange of the new view when editor is opening.
     * 
     * @param domain
     *            my editing domain
     * @param createdView
     *            A view
     * @return A new transactional command.
     */
    AbstractTransactionalCommand getAddAdapterMakerOnOpeningCommand(final TransactionalEditingDomain domain, final View createdView);

    /**
     * layout the new created views.
     * 
     * @param createdViews
     *            the new created views
     * @param childViewsAdaptersForCenterLayout
     *            the new created views for center layout
     * @param host
     *            container edit part
     * @return the layout command
     */
    Command getArrangeCreatedViewsCommand(List<IAdaptable> createdViews, List<IAdaptable> childViewsAdaptersForCenterLayout, IGraphicalEditPart host);

    /**
     * layout the new created views after opening the editor.
     * 
     * @param host
     *            container edit part
     * @return the layout command
     */
    Command getArrangeCreatedViewsOnOpeningCommand(IGraphicalEditPart host);

    /**
     * Return if the view contains a layout adapter, if it contains, layout is
     * launch on the view.
     * 
     * @param view
     *            the view
     * @return if the view contains a layout adapter, if it contains, layout is
     *         launch on the view
     */
    boolean hasToArrange(View view);

    /**
     * Create arrange command for one View.
     * 
     * @param request
     *            arrange request
     * @param host
     *            editpart
     * @return the arrange command
     */
    Command getArrangeCommand(ArrangeRequest request, EditPart host);

    /**
     * Store a set of views to layout for a next command in another Transaction.
     * 
     * @param gmfDiagram
     *            the {@link Diagram} for which childs views must be layouted
     * @param createdViewsToLayout
     *            a set of views to layout
     */
    void addCreatedViewsToLayout(Diagram gmfDiagram, LinkedHashSet<View> createdViewsToLayout);

    /**
     * Get the set of created views to layout per Diagram to be layouted. After
     * use of this map the client must clear it to avoid other subsequent
     * arrange command to be executed on the same already created views.
     * 
     * @return the set of created views to layout per Diagram to be layouted
     */
    Map<Diagram, Set<View>> getCreatedViewsToLayout();

    /**
     * Change the mode of the consumption. The data can be consume even if there
     * is already consume. This can be useful, for example, in case of several
     * preCommitListener that want to access the data.<BR>
     * This change must be temporary and must be restored to default value
     * (false).
     * 
     * @param ignoreConsumeState
     *            true to access to data already consumed.
     */
    void setIgnoreConsumeState(boolean ignoreConsumeState);

    /**
     * Return the first data if it exists.
     * 
     * @return the first data if it exists.
     */
    Option<AbstractLayoutData> getData();

    /**
     * Get the list of created views with center layout.
     * 
     * @return the list of views
     */
    Map<Diagram, Set<View>> getCreatedViewWithCenterLayout();

    /**
     * Add a view in the list.
     * 
     * @param gmfDiagram
     *            the {@link Diagram} for which childs views must be layouted in
     *            the center of the container
     * @param view
     *            the view to set
     */
    void addCreatedViewWithCenterLayout(Diagram gmfDiagram, LinkedHashSet<View> view);

}
