
package org.example.payment;

public class PaymentProcessor {

    public void processPayment(PaymentMethod paymentMethod, double amount) {
        paymentMethod.pay(amount);
    }
}
