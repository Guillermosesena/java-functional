package com.platzi.functional._04_functional;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class CLIArgumentsUtils {
    static void showHelp(CLIArguments cliArguments) {
        //Checks is CLIArguments have a manual (isHelp return true)
        Consumer<CLIArguments> consumerHelper = cliArguments1 -> {
            if(cliArguments1.isHelp()){
                System.out.println("Manual solicitado");
            }
        };

        consumerHelper.accept(cliArguments);
    }
    //Create CLIArguments without parameters
    static CLIArguments generateCLI(){
        Supplier<CLIArguments> generator = ( ) -> new CLIArguments();
        return generator.get();
    }

}
