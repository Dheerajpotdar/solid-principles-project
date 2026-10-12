package org.example;

import org.example.notification.NotificationService;
import org.example.payment.PaymentProcessor;
import org.example.receipt.ReceiptGenerator;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor =
                new PaymentProcessor();

        ReceiptGenerator receipt =
                new ReceiptGenerator();

        NotificationService notification =
                new NotificationService();

        processor.processPayment(1000);
        receipt.generateReceipt(1000);
        notification.sendNotification();
    }
}