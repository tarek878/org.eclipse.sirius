/*******************************************************************************
 * Copyright (c) 2010, 2014 THALES GLOBAL SERVICES.
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
package org.eclipse.sirius.tests.swtbot;

import org.eclipse.sirius.tests.swtbot.support.api.AbstractSiriusSwtBotGefTestCase;
import org.eclipse.sirius.tests.swtbot.support.api.business.UILocalSession;
import org.eclipse.sirius.tests.swtbot.support.api.business.UIResource;
import org.eclipse.sirius.tests.swtbot.support.api.condition.ItemEnabledCondition;
import org.eclipse.sirius.tests.swtbot.support.utils.SWTBotUtils;
import org.eclipse.swtbot.eclipse.finder.waits.Conditions;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotButton;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTree;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;

/**
 * All tests for control/uncontrol
 * 
 * @author dlecan
 */
public class ControlUncontrolTest extends AbstractSiriusSwtBotGefTestCase {

    private static final String CONTROL_SHELL_NAME = "Control";

    private static final String MODEL = "tc1993.ecore";

    private static final String SESSION_FILE = "tc1993.aird";

    private static final String DATA_UNIT_DIR = "data/unit/control/";

    private static final String FILE_DIR = "/";

    private UIResource sessionAirdResource;

    private UIResource modelUIResource;

    private UILocalSession localSession;

    /**
     * {@inheritDoc}
     */
    @Override
    protected void onSetUpBeforeClosingWelcomePage() throws Exception {
        copyFileToTestProject(Activator.PLUGIN_ID, DATA_UNIT_DIR, MODEL, SESSION_FILE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void onSetUpAfterOpeningDesignerPerspective() throws Exception {
        modelUIResource = new UIResource(designerProject, FILE_DIR, MODEL);
        sessionAirdResource = new UIResource(designerProject, FILE_DIR, SESSION_FILE);
        localSession = designerPerspective.openSessionFromFile(sessionAirdResource);
    }

    /**
     * Test method.
     * 
     * @throws Exception
     *             Test error.
     */
    public void testCheckDiagramAndTableSelectionWhenControl() throws Exception {
        final SWTBotTreeItem semanticResourceNode = localSession.getSemanticResourceNode(modelUIResource);
        final SWTBotTreeItem packageNodeToControl = semanticResourceNode.expandNode("tc1993").expandNode("sp1").select();

        SWTBotUtils.clickContextMenu(packageNodeToControl, "Control...");

        bot.waitUntilWidgetAppears(Conditions.shellIsActive(CONTROL_SHELL_NAME));
        final SWTBotShell controlShell = bot.shell(CONTROL_SHELL_NAME);
        controlShell.activate();

        final SWTBotButton ok = bot.button("OK");
        bot.waitUntilWidgetAppears(new ItemEnabledCondition(ok));
        ok.click();

        bot.waitUntilWidgetAppears(Conditions.shellIsActive("Wizard of representations selection"));
        final SWTBotShell wizardShell = bot.shell("Wizard of representations selection");
        wizardShell.activate();

        final SWTBotTree representationTree = bot.tree();
        final SWTBotTreeItem[] items = representationTree.getAllItems()[0].expand().getItems()[0].expand().getItems()[0].expand().getItems();

        // 1 diagram + 1 table
        assertEquals("Wrong number of detected representations", 2, items.length);

        assertTrue("1st representation should be checked", items[0].isChecked());
        assertTrue("2nd representation should be checked", items[1].isChecked());

        final SWTBotButton finish = bot.button("Finish");
        bot.waitUntilWidgetAppears(new ItemEnabledCondition(finish));
        finish.click();
    }

    /**
     * Test method.
     * 
     * @throws Exception
     *             Test error.
     */
    public void testCheckCancelControl() throws Exception {
        final SWTBotTreeItem semanticResourceNode = localSession.getSemanticResourceNode(modelUIResource);
        final SWTBotTreeItem packageNodeToControl = semanticResourceNode.expandNode("tc1993").expandNode("sp1").select();

        SWTBotUtils.clickContextMenu(packageNodeToControl, "Control...");

        bot.waitUntilWidgetAppears(Conditions.shellIsActive(CONTROL_SHELL_NAME));
        final SWTBotShell controlShell = bot.shell(CONTROL_SHELL_NAME);
        controlShell.activate();

        final SWTBotButton ok = bot.button("OK");
        bot.waitUntilWidgetAppears(new ItemEnabledCondition(ok));
        ok.click();

        bot.waitUntilWidgetAppears(Conditions.shellIsActive("Wizard of representations selection"));
        final SWTBotShell wizardShell = bot.shell("Wizard of representations selection");
        wizardShell.activate();

        final SWTBotButton cancel = bot.button("Cancel");
        bot.waitUntilWidgetAppears(new ItemEnabledCondition(cancel));
        cancel.click();
    }
}
