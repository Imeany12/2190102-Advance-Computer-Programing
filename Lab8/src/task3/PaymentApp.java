package task3;

public class PaymentApp {
    public static void main(String[] args) {
        // Implement the Client Code
        PaymentMethodFactory creditCardFactory = new CreditCardPaymentFactory();
        PaymentMethodFactory payPalFactory = new PayPalPaymentFactory();
        PaymentMethodFactory cryptoFactory = new CryptoPaymentFactory();

        PaymentMethod creditCardPayment = creditCardFactory.createPaymentMethod();
        PaymentMethod payPalPayment = payPalFactory.createPaymentMethod();
        PaymentMethod cryptoPayment = cryptoFactory.createPaymentMethod();

        // Test Your Implementation
        double paymentAmount = 100.0;
        creditCardPayment.processPayment(paymentAmount);
        payPalPayment.processPayment(paymentAmount);
        cryptoPayment.processPayment(paymentAmount);
    }
}
