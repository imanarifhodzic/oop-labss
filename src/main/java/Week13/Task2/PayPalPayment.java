package Week13.Task2;

class PayPalPayment implements Payment{
    public void processPayment() {
        System.out.println("PayPal payment successfully processed");
    }
}

class PayPalPaymentFactory implements PaymentFactory{
    public static Payment createPayment() {
        return new PayPalPayment();
    }
}
