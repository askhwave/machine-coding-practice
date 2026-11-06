package com.codekatha.machinecodingpractice.mine.questofmock.designpatterns.factory;

public class CardPayment implements PaymentMethod {
    @Override
    public void pay(Double amount) {
        System.out.println("Paid "+amount+" by CARD");
    }

}