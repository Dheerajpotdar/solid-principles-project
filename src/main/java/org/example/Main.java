package org.example;

import org.example.notification.NotificationService;
import org.example.payment.CardPayment;
import org.example.payment.PaymentProcessor;
import org.example.payment.UPIPayment;
import org.example.payment.WalletPayment;
import org.example.receipt.ReceiptGenerator;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        processor.processPayment(new UPIPayment(), 1000);
        processor.processPayment(new CardPayment(), 2000);
        processor.processPayment(new WalletPayment(), 500);


        ReceiptGenerator receipt = new ReceiptGenerator();
        receipt.generateReceipt(1000);

        NotificationService notification = new NotificationService();
        notification.sendNotification();
    }
}