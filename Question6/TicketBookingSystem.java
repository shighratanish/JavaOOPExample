class TicketBooking {
    private int seats = 1; // Only 1 seat available

    // synchronized method ensures only one thread can book at a time
    public synchronized void bookTicket(String user) {
        if (seats > 0) {
            System.out.println(user + " booked the seat successfully!");
            seats--;
        } else {
            System.out.println(user + " booking failed. No seats available!");
        }
    }
}

// Thread class for user booking
class User extends Thread {
    private TicketBooking ticketBooking;
    private String userName;

    public User(TicketBooking ticketBooking, String userName) {
        this.ticketBooking = ticketBooking;
        this.userName = userName;
    }

    @Override
    public void run() {
        ticketBooking.bookTicket(userName);
    }
}

// Main class to test the booking system
public class TicketBookingSystem {
    public static void main(String[] args) {
        TicketBooking booking = new TicketBooking();

        // Two users trying to book the last seat
        User user1 = new User(booking, "User1");
        User user2 = new User(booking, "User2");

        user1.start();
        user2.start();
    }
}
