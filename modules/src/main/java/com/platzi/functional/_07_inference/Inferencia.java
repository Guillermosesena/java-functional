package com.platzi.functional._07_inference;

import com.platzi.functional._06_reference_operator.NamesUtils;

import java.util.List;
import java.util.function.Function;

public class Inferencia {
    public static void main(String[] args) {
        Function<Integer, String> funcionConvertidora =
                integer -> "Al doble: " + (integer *2);
        System.out.println(funcionConvertidora.apply(7));


        List<String> alumnos = NamesUtils.getList("Hugo","Paco", "Luis");
        alumnos.forEach((String name) -> System.out.println(name));
        System.out.println("/////////");
        alumnos.forEach(name -> System.out.println(name));
        System.out.println("/////////");
        alumnos.forEach(System.out::println);

    }
}
