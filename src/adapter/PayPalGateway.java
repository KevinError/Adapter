package adapter;

public class PayPalGateway {
    private String email;

    public PayPalGateway(String email){
        this.email = email;
    }
    public void processPayment(double amount) {
        System.out.println("Processing through PayPal, payment:" + amount + ", user email:" + this.email);
    }
}
