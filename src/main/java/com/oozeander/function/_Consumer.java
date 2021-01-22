package com.oozeander.function;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer customer = new Customer("Billel", "5468975123");
        greet(customer);
        // Chaining Consumers
        greetConsumer.andThen(phoneConsumer).accept(customer);
        // BiConsumer
        greetV2.accept(customer, false);
    }

    static class Customer {
        private final String name;
        private final String phoneNumber;

        public Customer(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }
    }

    // Imperative
    static void greet(Customer customer) {
        System.out.println("Hello " + customer.name + ", thanks for registering phone number : " + customer.phoneNumber);
    }

    // Declarative
    static Consumer<Customer> greetConsumer
            = (customer) -> System.out.print("Hello " + customer.name);

    static Consumer<Customer> phoneConsumer
            = (customer) -> System.out.println(", thanks for registering phone number : " + customer.phoneNumber);

    static BiConsumer<Customer, Boolean> greetV2
            = (customer, showPhoneNumber) -> System.out.println("Hello " + customer.name + ", thanks for registering phone number" + (!showPhoneNumber ? "" : " : " + customer.phoneNumber));
}