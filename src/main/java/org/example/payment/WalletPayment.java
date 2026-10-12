package org.example.payment;

public class WalletPayment implements PaymentMethod {

    @Override
    public void pay(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Payment amount must be greater than zero"
            );
        }

        System.out.println("Processing Wallet payment of Rs. " + amount);
    }
}
