/*
 * Scaffold Hunter
 * Copyright (C) 2006-2008 PG504
 * Copyright (C) 2010-2011 PG552
 * See README.txt in the root directory of the Scaffold Hunter source tree
 * for details.
 *
 * Scaffold Hunter is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * Scaffold Hunter is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package edu.udo.scaffoldhunter.view.scaffoldtree;

import javax.swing.table.DefaultTableCellRenderer;

import com.l2fprod.common.beans.editor.ComboBoxPropertyEditor;

import edu.udo.scaffoldhunter.gui.util.PropertiesBeanInfo;

/**
 * @author Bernhard Dick
 * 
 */
public class ScaffoldTreeViewConfigBeanInfo extends PropertiesBeanInfo {
    /**
     */
    public ScaffoldTreeViewConfigBeanInfo() {
        super(ScaffoldTreeViewConfig.class);
        setPropertyAssociatedClasses("layout", LayoutEditor.class, DefaultTableCellRenderer.class);
    }

    /**
     * @author Thorsten Flügel
     */
    public static class LayoutEditor extends ComboBoxPropertyEditor {
        /**
         * Creates a Combobox containing all values from {@link VLayoutsEnum}
         */
        public LayoutEditor() {
            super();
            setAvailableValues(new Object[] { VLayoutsEnum.RADIAL_LAYOUT, VLayoutsEnum.BALLOON_LAYOUT,
                    VLayoutsEnum.LINEAR_LAYOUT});
        }
    }
}
