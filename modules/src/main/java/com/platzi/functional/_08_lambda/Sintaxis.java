package com.platzi.functional._08_lambda;

import com.platzi.functional._06_reference_operator.NamesUtils;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Sintaxis {
    public static void main(String[] args) {
        List<String> courses = NamesUtils.getList("Java","Functional");
        //first lambda
        courses.forEach(course-> System.out.println(course));

        BiFunction<Integer, Integer, Integer> s = (x,y) -> x * y;

        useZero(()->2);//return 2
        usePredicate(text -> text.isEmpty());
        useBiFunction((x,y) -> x+y);
        //when the lambda is longer, java needs to know where the value returns
        useBiFunction((x,y) -> {
            System.out.println("X:" + x + ", Y:" + y);
            return x-y;
        });
        //Example get a connection
        useNothing(() -> {

        });

        //It's possible to write the data type (as objets) as parameters, but it's not common
        // Primitive Types aren't allowed (not use int, instead Integer )
        useBiFunction((Integer x, Integer y) -> x * y);

    }

    static void useZero(ZeroArguments zeroArguments){

    }

    @FunctionalInterface
    interface ZeroArguments{
        int get();
    }

    static void usePredicate(Predicate<String> predicate){

    }

    static void useBiFunction(BiFunction<Integer,Integer, Integer> operation) {

    }

    static void useNothing(DoesNothing doesNothing){

    }

    @FunctionalInterface
    interface DoesNothing{
        void nothing();
    }
}
