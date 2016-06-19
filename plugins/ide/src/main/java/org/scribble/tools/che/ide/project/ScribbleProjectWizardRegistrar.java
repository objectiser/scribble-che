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
package org.scribble.tools.che.ide.project;

import com.google.inject.Provider;

import org.eclipse.che.api.workspace.shared.dto.ProjectConfigDto;
import org.eclipse.che.ide.api.project.type.wizard.ProjectWizardRegistrar;
import org.eclipse.che.ide.api.wizard.WizardPage;
import org.scribble.tools.che.shared.Constants;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;


/**
 * The project wizard for creating a new JSON Example project.
 */
public class ScribbleProjectWizardRegistrar implements ProjectWizardRegistrar {

    private final List<Provider<? extends WizardPage<ProjectConfigDto>>> wizardPages;

    public ScribbleProjectWizardRegistrar() {
        wizardPages = new ArrayList<>();
    }

    @NotNull
    public String getProjectTypeId() {
        return Constants.SCRIBBLE_PROJECT_TYPE_ID;
    }

    @NotNull
    public String getCategory() {
        return Constants.SCRIBBLE_CATEGORY;
    }

    @NotNull
    public List<Provider<? extends WizardPage<ProjectConfigDto>>> getWizardPages() {
        return wizardPages;
    }

}
