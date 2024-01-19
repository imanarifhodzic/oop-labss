package Week13.Task2;

public class Main {
    public static void main(String[] args) {
        Payment cardPayment = CreditCardPaymentFactory.createPayment();
        cardPayment.processPayment();

        Payment payPalPayment = PayPalPaymentFactory.createPayment();
        payPalPayment.processPayment();
    }
}
