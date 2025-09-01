// BookingSystem.java
public class BookingSystem {

    public Ticket bookTicket(Passenger passenger, Train train, int distance) {
        System.out.println("Booking ticket for " + passenger.getName() + " on " + train.trainName + "...");
        if (distance <= 0) {
            System.out.println("Booking failed: Distance must be positive.");
            return null;
        }
        Ticket ticket = new Ticket(passenger, train, distance);
        System.out.println("Booking Successful!");
        return ticket;
    }

    public static void main(String[] args) {
        // 1. Create a booking system instance
        BookingSystem system = new BookingSystem();

        // 2. Create passenger and train objects
        Passenger p1 = new Passenger("Rohan Sharma", 32, "9876543210");
        
        // Polymorphism: Using a parent reference for a child object
        Train duronto = new VantheBharat(12273, "Duronto Express", "New Delhi", "Howrah", true);

        // 3. Book a ticket
        int travelDistance = 1450; // in km
        Ticket myTicket = system.bookTicket(p1, duronto, travelDistance);

        // 4. Print the ticket if booking was successful
        if (myTicket != null) {
            myTicket.printTicketDetails();
        }
        
        System.out.println("\n--- Another Booking ---");
        
        Passenger p2 = new Passenger("Priya Singh", 28, "8765432109");
        Train shatabdi = new VantheBharat(12020, "Howrah-Ranchi Shatabdi", "Howrah", "Ranchi", true);
        
        int shatabdiDistance = 410;
        Ticket anotherTicket = system.bookTicket(p2, shatabdi, shatabdiDistance);

        if (anotherTicket != null) {
            anotherTicket.printTicketDetails();
        }
    }
}