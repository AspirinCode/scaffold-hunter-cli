/*
 * Scaffold Hunter
 * Copyright (C) 2006-2008 PG504
 * Copyright (C) 2010-2011 PG552
 * Copyright (C) 2012-2014 LS11
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

package edu.udo.scaffoldhunter.cli.args;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

/**
 * Argument class for session interaction
 * command
 * @author Shamshad Alam
 *
 */
@Parameters(commandNames = {"session"}, commandDescriptionKey = "CLI.CommandHelp.Session")
public class SessionArgs extends DBArgs{
    
    /**
     * name of the session
     */
    @Parameter(names = {"-n", "--session-name"}, description = "Title of the session")
    public String title;
    
    /**
     * name of the dataset
     */
    @Parameter(names = {"-d", "--dataset-name"}, description = "Dataset name that is required to create a session")
    public String datasetName;
    
    /**
     * name of the tree
     */
    @Parameter(names = {"-t", "--tree-name"}, description = "Tree name that is required to create a session")
    public String treeName;    
}
