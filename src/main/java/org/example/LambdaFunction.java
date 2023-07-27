package org.example;

import java.util.function.BiFunction;
import java.util.function.Function;

public class LambdaFunction {
    public static void main(String[] args) {
        int number = incrementByOne.apply(2);
        System.out.println(number);
        int number2 = multiplyByTen.apply(2);
        System.out.println(number2);

        int number3 = 1;
        System.out.println(add1ThenMultiplyBy10.apply(3));

        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4, 10));


    }
    static Function<Integer, Integer> incrementByOne = number -> number + 1;
    static Function<Integer, Integer> multiplyByTen = number -> number*10;
    static Function<Integer, Integer> add1ThenMultiplyBy10 = incrementByOne.andThen(multiplyByTen);

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy)
            -> (numberToIncrementByOne + 1) * numberToMultiplyBy;



}
