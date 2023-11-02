package task2;

public class PaymentApp {
    public static void main(String[] args) {    
        // Implement the Client Code
        PaymentMethodFactory paymentFactory = new PaymentMethodFactory();

        // Create payment objects without knowing the exact class
        PaymentMethod creditCardPayment = paymentFactory.createPaymentMethod("credit card");
        PaymentMethod payPalPayment = paymentFactory.createPaymentMethod("paypal");
        PaymentMethod cryptoPayment = paymentFactory.createPaymentMethod("crypto");

        // Test Your Implementation
        double paymentAmount = 100.0;
        creditCardPayment.processPayment(paymentAmount);
        payPalPayment.processPayment(paymentAmount);
        cryptoPayment.processPayment(paymentAmount);
    }
}
