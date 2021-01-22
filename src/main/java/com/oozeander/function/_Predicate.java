package com.oozeander.function;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("0142035661"));
        // Chaining Predicates with and()/or()
        System.out.println(isPhoneNumberBeginsWithZero.and(isPhoneNumberHaveTenNumbers).test("0142035661"));
        // BiPredicate
        System.out.println(isSame.test("0142035661", "0142035662"));
    }

    // Imperative
    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("0") && phoneNumber.length() == 10;
    }

    // Declarative
    static Predicate<String> isPhoneNumberBeginsWithZero =
            (phoneNumber) -> phoneNumber.startsWith("0");

    static Predicate<String> isPhoneNumberHaveTenNumbers =
            (phoneNumber) -> phoneNumber.length() == 10;

    static BiPredicate<String, String> isSame =
            (phoneNumber1, phoneNumber2) -> phoneNumber1.equals(phoneNumber2);
}