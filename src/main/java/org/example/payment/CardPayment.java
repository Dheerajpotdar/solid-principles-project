package org.example.payment;

public class CardPayment implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Processing Card payment of Rs. " + amount);
    }
}
