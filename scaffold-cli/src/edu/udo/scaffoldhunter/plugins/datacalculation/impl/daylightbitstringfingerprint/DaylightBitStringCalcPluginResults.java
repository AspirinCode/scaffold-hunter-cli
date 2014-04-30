/*
 * Scaffold Hunter
 * Copyright (C) 2006-2008 PG504
 * Copyright (C) 2010-2011 PG552
 * See the file README.txt in the root directory of the Scaffold Hunter
 * source tree for details.
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

package edu.udo.scaffoldhunter.plugins.datacalculation.impl.daylightbitstringfingerprint;

import java.util.Collections;
import java.util.Set;

import org.openscience.cdk.interfaces.IAtomContainer;

import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;

import edu.udo.scaffoldhunter.model.PropertyType;
import edu.udo.scaffoldhunter.model.data.MessageListener;
import edu.udo.scaffoldhunter.model.db.PropertyDefinition;
import edu.udo.scaffoldhunter.plugins.datacalculation.CalcPluginResults;

/**
 * @author kriege
 *
 */
public class DaylightBitStringCalcPluginResults implements CalcPluginResults {
    DaylightBitStringCalcPluginArguments arguments;
    Iterable<IAtomContainer> molecules;
    MessageListener msgListener;
    PropertyDefinition propDef;

    /**
     * @param molecules the input molecule {@link Iterable}
     * @param arguments arguments for result creation 
     * @param msgListener
     *            the message listener used for reporting of errors
     */
    public DaylightBitStringCalcPluginResults(Iterable<IAtomContainer> molecules, DaylightBitStringCalcPluginArguments arguments, MessageListener msgListener) {
        this.arguments = arguments;
        this.molecules = molecules;
        this.msgListener = msgListener;
        propDef = new PropertyDefinition();
        propDef.setKey("DaylightBitStringFingerprint");
        propDef.setTitle("DaylightBitStringFingerprint");
        propDef.setDescription("Path-based hash-key fingerprint.");
        propDef.setScaffoldProperty(false);
        propDef.setPropertyType(PropertyType.BitStringFingerprint);
    }

    @Override
    public Set<PropertyDefinition> getCalculatedProperties() {
        return Sets.newLinkedHashSet(Collections.singleton(propDef));
    }

    @Override
    public Iterable<IAtomContainer> getMolecules() {
        return Iterables.transform(molecules, new DaylightBitStringCalcPluginTransformFunction(arguments, propDef, msgListener));
    }

}
