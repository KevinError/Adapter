package adapter;

public class StripeGateway {
    private String cardHolderName;
    private String cardNumber;
    private String expirationDate;
    public StripeGateway(String cardHolderName, String cardNumber, String expirationDate){
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;

    }
    public void processPayment(double amount) {
        System.out.println("Processing through Stripe, payment:" + amount +
                ", cardholder name:" + this.cardHolderName +
                ", card number:" + this.cardNumber +
                ", expiration date: " + this.expirationDate);
    }
}
