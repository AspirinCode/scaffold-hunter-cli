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

import java.io.File;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;
import com.beust.jcommander.converters.FileConverter;

/**
 * Arguments to split scaffold in subset at the specified ring level
 * @author Shamshad Alam
 *
 */
@Parameters(commandNames = {"split"}, commandDescriptionKey = "CLI.CommandHelp.Split")
public class SplitScaffoldRingArgs extends AbstractArgs {
    
    /**
     * Ring level to split at
     */
    @Parameter(names = {"-k", "--ring-level"}, description = "Level of ring at which you want to perform split", descriptionKey = "")
    public int ringLevel = 1;
    
    /**
     * Input scaffold file to read molecules from
     */
    @Parameter(names = {"-i", "--input-file"}, converter = FileConverter.class, description = "Input scaffold file to read the scaffolds", descriptionKey = "")
    public File inputFile;
    
    /**
     * Output folder in which generated molecules file for
     * each scaffold at the ring level is saved
     */
    @Parameter(names = {"-o", "--output-folder"}, description = "Output scaffold folder in which splitted ring is saved", descriptionKey = "")
    public String outputFolder;
}
