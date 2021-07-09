package com.platzi.functional._14_optionals;

import java.util.*;

public class Optionals2 {
    public static void main(String[] args){
        List<String> names = getNames();
        if(names != null)
        {
            //
        }
        Optional<List<String>> optionalNames = getOptionalNames();
        if(optionalNames.isPresent()){

        }
        //executes only when has elements
        optionalNames.ifPresent(namesValue -> namesValue.forEach(System.out::println));

        Optional<String> valueblePlayer = optionalValuablePlayer();
        //If don't get a most valuablePlayer
        String valuablePlayerName = valueblePlayer.orElseGet(()-> "No player");

    }


    static List<String> getNames(){
        List<String> list = new LinkedList<>();
        //return list;
        //returns a list without elements
        return Collections.emptyList();
    }

    static String ValuablePlayer(){

        //return "";
        return null;
    }

    static int mostExpensiveItem(){
        return -1;
    }

    static Optional<List<String>> getOptionalNames(){
        List<String> nameList = new LinkedList<>();
        //get names
        return Optional.of(nameList);
    }

    static Optional<String> optionalValuablePlayer(){
        //
        //return Optional.ofNullable()
        //Maybe executes a query and don't get a register
        try{
            //Accesos
            return Optional.of("Sinuhe");
        }catch(Exception e){
            e.printStackTrace();
        }
        //Avoid to use nulls
        return Optional.empty();
    }
}
