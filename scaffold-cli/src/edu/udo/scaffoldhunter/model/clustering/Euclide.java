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

package edu.udo.scaffoldhunter.model.clustering;

import java.util.Collection;

import edu.udo.scaffoldhunter.model.PropertyType;
import edu.udo.scaffoldhunter.model.db.Property;
import edu.udo.scaffoldhunter.model.db.PropertyDefinition;
import edu.udo.scaffoldhunter.model.db.Structure;

/**
 * 
 * 
 * @author Philipp Kopp
 * @author Till Schäfer
 * @param <S>
 *            molecule / scaffold
 * 
 */
public class Euclide<S extends Structure> extends Distance<S> {

    /**
     * @param propertyVector
     *            The {@link Property}s which should be used for the calculation
     *            of the distance
     */
    public Euclide(Collection<PropertyDefinition> propertyVector) {
        super(propertyVector);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * edu.udo.scaffoldhunter.model.clustering.Distance#isBitVectorDistance()
     */
    @Override
    public PropertyCount acceptedPropertyCount() {
        return Distances.EUCLIDE.acceptedPropertyCount();
    }

    /*
     * (non-Javadoc)
     * 
     * @see edu.udo.scaffoldhunter.model.clustering.Distance#calcDist(edu.udo.
     * scaffoldhunter.model.clustering.DendrogramModelNode,
     * edu.udo.scaffoldhunter.model.clustering.DendrogramModelNode)
     */
    @Override
    public double calcDist(HierarchicalClusterNode<S> node1, HierarchicalClusterNode<S> node2) {
        logger.trace("Starting calcDist");
        
        double dist = 0;
        double value1;
        double value2;
        for (PropertyDefinition propDef : propertyVector) {
            value1 = node1.getContent().getNumPropertyValue(propDef);
            value2 = node2.getContent().getNumPropertyValue(propDef);
            dist += Math.pow((value1 - value2), 2);
        }
        dist = Math.sqrt(dist);
        logger.trace("Dist is:"+dist);
        return dist;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * edu.udo.scaffoldhunter.model.clustering.Distance#acceptedPropertyType()
     */
    @Override
    public PropertyType acceptedPropertyType() {
        return Distances.EUCLIDE.acceptedPropertyType();
    }
}
