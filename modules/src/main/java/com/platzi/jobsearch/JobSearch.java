package com.platzi.jobsearch;

import com.beust.jcommander.JCommander;
import com.platzi.jobsearch.cli.CLIArguments;

import java.util.function.Supplier;

import static com.platzi.jobsearch.cli.CommanderFunctions.buildCommanderWithName;


public class JobSearch {
    public static void main(String[] args) {

        JCommander jCommander = buildCommanderWithName("job-search", CLIArguments::newInstance);

    }
}
