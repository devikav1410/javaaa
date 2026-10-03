class TicketBooking {
    private int ticketsAvailable = 5;

    public synchronized void bookTicket(String customerName) {
        if (ticketsAvailable > 0) {
            System.out.println(customerName + " booked ticket number " + ticketsAvailable);
            ticketsAvailable--;
            System.out.println("Tickets remaining: " + ticketsAvailable);
        } else {
            System.out.println(customerName + " could not book a ticket. No tickets left!");
        }
    }
}

class Customer extends Thread {
    private TicketBooking bookingSystem;
    private String customerName;

    public Customer(TicketBooking bookingSystem, String customerName) {
        this.bookingSystem = bookingSystem;
        this.customerName = customerName;
    }

    public void run() {
        bookingSystem.bookTicket(customerName);
    }
}

public class TicketBookingDemo {
    public static void main(String[] args) {
        TicketBooking bookingSystem = new TicketBooking();

        Customer c1 = new Customer(bookingSystem, "Alice");
        Customer c2 = new Customer(bookingSystem, "Bob");
        Customer c3 = new Customer(bookingSystem, "Charlie");
        Customer c4 = new Customer(bookingSystem, "David");
        Customer c5 = new Customer(bookingSystem, "Emma");
        Customer c6 = new Customer(bookingSystem, "Frank");

        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();
        c6.start();
    }
}
