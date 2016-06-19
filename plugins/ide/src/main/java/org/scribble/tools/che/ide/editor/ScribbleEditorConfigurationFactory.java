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
package org.scribble.tools.che.ide.editor;

import org.eclipse.che.ide.api.editor.texteditor.TextEditor;

/**
 * Helper factory for creating the JSON Example specific editor configuraiton.
 */
// TODO: remove, if unused
public interface ScribbleEditorConfigurationFactory {

    /**
     * Create a {@link ScribbleEditorConfiguration}.
     *
     * @param editor
     *         the editor
     * @return the JSON Example editor configuration
     */
    ScribbleEditorConfiguration create(TextEditor editor);
}
