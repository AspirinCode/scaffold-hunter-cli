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

package edu.udo.scaffoldhunter.gui.util;

import java.beans.BeanInfo;

/**
 * Looks up BeanInfo classes.
 * 
 * @author Thorsten Flügel
 * 
 */
public class BeanInfoResolver implements com.l2fprod.common.beans.BeanInfoResolver {
    @Override
    public BeanInfo getBeanInfo(Object object) {
        if (object == null) {
            return null;
        }

        return getBeanInfo(object.getClass());
    }

    @SuppressWarnings("rawtypes")
    @Override
    public BeanInfo getBeanInfo(Class beanClass) throws RuntimeException {
        if (beanClass == null) {
            return null;
        }

        String classname = beanClass.getName();

        try {
            BeanInfo beanInfo = (BeanInfo) Class.forName(classname + "BeanInfo").newInstance();
            return beanInfo;
        } catch (Exception e) {
            // no beaninfo was found, use a generic beaninfo that simply extracts all annotated properties
            return new PropertiesBeanInfo(beanClass);
        }
    }
}