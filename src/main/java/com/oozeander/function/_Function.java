package com.oozeander.function;

import java.math.BigInteger;
import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        System.out.println(increment(BigInteger.valueOf(5)));
        // Chaining Functions
        System.out.println(incrementFunc.andThen(multipleByTen).apply(BigInteger.valueOf(5)));
        // BiFunction
        System.out.println(incrementAndMultiplyByTen.apply(BigInteger.TWO, BigInteger.TWO));
    }

    // Imperative
    static BigInteger increment(BigInteger number) {
        return number.add(BigInteger.ONE);
    }

    // Declarative
    static Function<BigInteger, BigInteger> incrementFunc
            = (number) -> number.add(BigInteger.ONE);

    static Function<BigInteger, BigInteger> multipleByTen
            = (number) -> number.multiply(BigInteger.TEN);

    static BiFunction<BigInteger, BigInteger, BigInteger> incrementAndMultiplyByTen
            = (numberToIncrement, numberToMultiplyBy) -> {
        BigInteger result = numberToIncrement.add(BigInteger.ONE);
        return result.multiply(numberToMultiplyBy);
    };
}