package com.oozeander.optional;

import java.util.Optional;

public class _Optionals {
    public static void main(String[] args) {
        System.out.println(Optional.empty() + "\n" + Optional.of("Can't be null")
            + "\n" + Optional.ofNullable(null));
        // orElseGet / orElseThrow / map / filter
        Object orElseGet = Optional.ofNullable(null).orElseGet(() -> "None"),
                orElseThrow = Optional.ofNullable("Some Data").orElseThrow(() -> new RuntimeException("Exception thrown"));
        System.out.println(orElseGet + "\n" + orElseThrow);
        // get / ifPresent / isPresent
        Optional.ofNullable(null)
                .ifPresentOrElse(str -> System.out.println("Sending email to : " + str),
                        () -> {
                            System.out.println("Can't send email");
                        });
    }
}