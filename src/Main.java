import adapter.*;
public class Main {
    public static void main(String[] args) {

        PaymentGateway payPalAdapter = new PayPalAdapter(new PayPalGateway("@email.com"));
        PaymentGateway stripeAdapter = new StripeAdapter(new StripeGateway(
                "Kevin", "0123456789", "11/12"));
        PaymentGateway squareAdapter = new SquareAdapter(new SquareGateway("12345"));

        payPalAdapter.processPayment(1000);
        stripeAdapter.processPayment(2000);
        squareAdapter.processPayment(3000);

    }
}