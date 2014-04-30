/*
 * Scaffold Hunter
 * Copyright (C) 2006-2008 PG504
 * Copyright (C) 2010-2011 PG552
 * Copyright (C) 2012 LS11
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

package edu.udo.scaffoldhunter.model.filtering.subsearch.fingerprint;

/**
 * Interface for single features for a fingerprint (calculation + storage)
 * 
 * @author Nils Kriege
 * @author Till Schäfer
 * 
 * @param <I>
 *            the type of feature description
 * @param <O>
 *            the type of feature result
 */
public interface FeatureStorage<I, O> {

    /**
     * Calculate the feature
     * 
     * @param feature
     *            the feature description
     */
    public void processFeature(I feature);

    /**
     * Get feature result
     * 
     * @return the feature result
     */
    public O getResult();

    /**
     * Get feature count, i.e., the number of features stored 
     * 
     * @return the feature count
     */
    public int getFeatureCount();

}