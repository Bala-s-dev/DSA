import java.util.concurrent.atomic.AtomicInteger;

public class Ticket{
    private static final AtomicInteger pnrCounter = new AtomicInteger(1000);

    private String pnr;
    private Train train;
    private Passenger passenger;
    private double fare;
    public Ticket(Passenger passenger, Train train, int distance){
        this.pnr = "PNR" + pnrCounter.getAndIncrement();
        this.train = train;
        this.passenger = passenger;
        this.fare = train.fairPrice(distance);
        
    }
    public void printTicketDetails() {
        System.out.println("===================================");
        
        System.out.println("          E-TICKET");
        System.out.println("===================================");
        System.out.println("PNR Number: " + pnr);
        System.out.println("Passenger Name: " + passenger.getName());
        System.out.println("Contact Number: " + passenger.getPhoneNumber());
        System.out.println("-----------------------------------");
        train.getTrainDetail();
        System.out.println("-----------------------------------");
        System.out.printf("Total Fare: Rs. %.2f%n", fare);
        System.out.println("===================================");
        System.out.println("         WISH YOU A HAPPY JOURNEY! ");
        System.out.println("===================================");
    }
}