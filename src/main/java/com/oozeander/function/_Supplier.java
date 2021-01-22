package com.oozeander.function;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDbConnectionUrl());
        System.out.println(getDbUrl.get());
    }

    // Imperative
    static String getDbConnectionUrl() {
        return "jdbc:postgresql://localhost:5432/users";
    }

    // Declarative
    static Supplier<String> getDbUrl = () -> "jdbc:postgresql://localhost:5432/users";
}