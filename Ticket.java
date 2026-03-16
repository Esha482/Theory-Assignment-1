public class Ticket {
    String ticketID;
    Seat seat;
    CinemaScreen screen;
    double price;
    boolean booked;

    public Ticket(String ticketID, Seat seat, CinemaScreen screen) {
        this.ticketID = ticketID;
        this.seat = seat;
        this.screen = screen;
        this.price = seat.seatType.getPrice();
        this.booked = true;
        seat.bookSeat();
    }

    public void cancelTicket() {
        booked = false;
        seat.cancelSeat();
        System.out.println("Ticket " + ticketID + " cancelled.");
    }

    public void displayTicket() {
        System.out.println("\nTicket ID: " + ticketID);
        System.out.println("Screen: " + screen.screenID);
        System.out.println("Seat: " + seat.seatID);
        System.out.println("Movie: " + screen.moviePlaying.title);
        System.out.println("Price: " + price);
        System.out.println("Booked: " + booked);
    }
}