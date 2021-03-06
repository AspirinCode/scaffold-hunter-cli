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

import edu.udo.scaffoldhunter.util.I18n;

/**
 * @author Bernhard Dick
 *
 */
public enum VLayoutsEnum {
    /** 
     * the iconic radial scaffold tree layout 
     *
     * @see VRadialWidthLayout
     */
    RADIAL_LAYOUT,
    /** 
     * the linear scaffold tree layout
     * 
     * @see VLinearLayout
     */
    LINEAR_LAYOUT,
    /**
     * the ballon scaffold tree layout
     * 
     * @see VBalloonLayout
     */
    BALLOON_LAYOUT;
    
    @Override
    public String toString() {
        return I18n.get("ScaffoldTreeView.Layout." + name());
    }
}
