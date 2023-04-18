package adapter;

public class SquareGateway {
    private String locationID;

    public SquareGateway(String locationID){
        this.locationID = locationID;
    }

    public void processPayment(double amount){
        System.out.println("Processing through Square, payment:" + amount +
                ", location:" + this.locationID);
    }
}
