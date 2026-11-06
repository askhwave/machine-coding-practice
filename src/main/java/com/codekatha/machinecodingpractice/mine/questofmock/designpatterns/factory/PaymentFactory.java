package com.codekatha.machinecodingpractice.mine.questofmock.designpatterns.factory;

public class PaymentFactory {

    public PaymentMethod create (String type){
       return  switch (type){
           case "CARD" -> new CardPayment();
           case "UPI" -> new UpiPayment();
           default -> throw new IllegalArgumentException("Unknown payment type: " + type);
       };
    }
}
