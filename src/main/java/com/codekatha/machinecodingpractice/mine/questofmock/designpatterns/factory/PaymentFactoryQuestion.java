package com.codekatha.machinecodingpractice.mine.questofmock.designpatterns.factory;

/**
 * Question 56 (design pattern practice): Factory
 * <p>
 * Problem: five controllers all repeat
 * if (type.equals("CARD")) new CardPayment() else if (type.equals("UPI")) new UpiPayment() else throw
 * <p>
 * Create these types (all nested static inside this file is fine, or separate files if you prefer):
 * 1. interface PaymentMethod   -> void pay(double amount)
 * 2. class CardPayment         -> pay prints "Paid 500.0 by CARD"
 * 3. class UpiPayment          -> pay prints "Paid 300.0 by UPI"
 * 4. class PaymentFactory      -> one method: static PaymentMethod create(String type)
 * - the only place with if/else (or switch) that knows the concrete classes
 * - unknown type throws IllegalArgumentException("Unknown payment type: " + type)
 * 5. In main: two "controllers" (plain methods) that call PaymentFactory.create(type).pay(amount)
 * and do not contain any if/else themselves
 * <p>
 * Expected output:
 * Paid 500.0 by CARD
 * Paid 300.0 by UPI
 * Error: Unknown payment type: WALLET
 * <p>
 * Part 2 (after part 1 works): add WalletPayment. Count how many existing classes you had to edit.
 * Goal: only PaymentFactory changes, controllers stay untouched.
 * <p>
 * Part 3 (stretch): replace the if/else in the factory with a Map<String, Supplier<PaymentMethod>>
 * so adding a new type means adding one map entry, no new else-if.
 */
public class PaymentFactoryQuestion {

    public static void main(String[] args) {
        // write your code, then call your two controller methods here
        checkoutController();
        walletController();

    }

    static void checkoutController() {
        try {
            PaymentFactory factory = new PaymentFactory();
            factory.create("CARD").pay(500.0);
            factory.create("UPI").pay(300.0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    static void walletController() {
        try {
            PaymentFactory factory = new PaymentFactory();
            factory.create("WALLET").pay(500.0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}