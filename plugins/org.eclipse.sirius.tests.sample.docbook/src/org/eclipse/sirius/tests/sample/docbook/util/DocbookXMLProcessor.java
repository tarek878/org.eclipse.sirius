/*******************************************************************************
 * Copyright (c) 2013, 2014 THALES GLOBAL SERVICES.
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
package org.eclipse.sirius.tests.sample.docbook.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;
import org.eclipse.sirius.tests.sample.docbook.DocbookPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class DocbookXMLProcessor extends XMLProcessor {

    /**
     * Public constructor to instantiate the helper. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public DocbookXMLProcessor() {
        super((EPackage.Registry.INSTANCE));
        DocbookPackage.eINSTANCE.eClass();
    }

    /**
     * Register for "*" and "xml" file extensions the DocbookResourceFactoryImpl
     * factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected Map<String, Resource.Factory> getRegistrations() {
        if (registrations == null) {
            super.getRegistrations();
            registrations.put(XMLProcessor.XML_EXTENSION, new DocbookResourceFactoryImpl());
            registrations.put(XMLProcessor.STAR_EXTENSION, new DocbookResourceFactoryImpl());
        }
        return registrations;
    }

} // DocbookXMLProcessor
