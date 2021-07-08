package com.platzi.functional._04_functional;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class StringsFunction {
    public static void main(String[] args) {
        UnaryOperator<String> quote = text ->"\""+ text + "\"";
        UnaryOperator<String> addMark = text ->text + "!";
        System.out.println(quote.apply("Hi there!"));
        System.out.println(addMark.apply("Hi there"));

        BiFunction<Integer, Integer, Integer> multiplicacion =
                (x, y) -> x*y;
        System.out.println(multiplicacion.apply(5,5));

        BinaryOperator<Integer> multiplicacion2 =
                (x, y) -> x*y;
        System.out.println(multiplicacion2.apply(5,5));
        //String format add spaces in order to complete the desire text length
        BiFunction<String, Integer, String> leftPad =
                (text, number) -> String.format("%" + number + "s" , text);

        System.out.println(leftPad.apply("Java", 10));

        List<BiFunction<String, Integer, String>> formateadores;
    }
}
