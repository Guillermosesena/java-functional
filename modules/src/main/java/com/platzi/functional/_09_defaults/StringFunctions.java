package com.platzi.functional._09_defaults;

public class StringFunctions {
    @FunctionalInterface
    interface StringOperation {
        int getAmount();

        default void operate(String text){
            int x = getAmount();
            while(x --> 0){
                System.out.println(text);
            }
        }
    }

    @FunctionalInterface
    interface DoOperation {
        void take(String text);

        default void execute(int x, String text){
            while(x --> 0){
                take(text);
            }
        }
    }

    public static void main(String[] args) {
        StringOperation six = () ->5;//defines get amount
        six.operate("student");

        DoOperation operateFive = text-> System.out.println(text);//defines take
        operateFive.take( "Platzi");
        System.out.println("/////////");
        operateFive.execute( 2,"Platzi");
    }

}
