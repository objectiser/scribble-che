/*******************************************************************************
 * Copyright (c) 2012-2016 Codenvy, S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Codenvy, S.A. - initial API and implementation
 *******************************************************************************/
package org.scribble.tools.che.projecttype;

import com.google.inject.Inject;

import static org.scribble.tools.che.shared.Constants.LANGUAGE;
import static org.scribble.tools.che.shared.Constants.SCRIBBLE_LANG;
import static org.scribble.tools.che.shared.Constants.SCRIBBLE_PROJECT_TYPE_ID;

import org.eclipse.che.api.project.server.type.ProjectTypeDef;

/**
 * The Scribble project type.
 */
public class ScribbleProjectType extends ProjectTypeDef {

    /**
     * Constructor for the JSON example project type.
     */
    @Inject
    public ScribbleProjectType() {
        super(SCRIBBLE_PROJECT_TYPE_ID, SCRIBBLE_PROJECT_TYPE_ID, true, false);
        addConstantDefinition(LANGUAGE, LANGUAGE, SCRIBBLE_LANG);
        //addVariableDefinition(Constants.JSON_EXAMPLE_SCHEMA_REF_ATTRIBUTE, "Referenced base schema", /*required*/ true);
    }
}
