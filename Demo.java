public class Demo {
    public static void main(String[] args) {

        // Movies
        Movie m1 = new Movie("Avengers", "Action", 2.5, "5:00 PM");
        Movie m2 = new Movie("Inception", "Sci-Fi", 2.2, "6:30 PM");

        // Branches
        CityCinema branch1 = new CityCinema("Star City Mall", "Karachi", "Block A, City Mall");
        CityCinema branch2 = new CityCinema("Star Downtown", "Karachi", "Main Street");

        // Screens
        branch1.addScreen(new CinemaScreen("S1", "3D", m1, 12));
        branch1.addScreen(new CinemaScreen("S2", "2D", m2, 15));
        branch2.addScreen(new CinemaScreen("S3", "IMAX", m1, 18));

        // Display cinema layouts
        branch1.displayCinema();
        branch2.displayCinema();

        // Book tickets
        CinemaScreen screen1 = (CinemaScreen) branch1.getScreens().get(0);
        Seat seat1 = (Seat) screen1.getSeats().get(0); // first seat
        Ticket t1 = new Ticket("T001", seat1, screen1);
        t1.displayTicket();

        CinemaScreen screen2 = (CinemaScreen) branch2.getScreens().get(0);
        Seat seat2 = (Seat) screen2.getSeats().get(5); // some seat
        Ticket t2 = new Ticket("T002", seat2, screen2);
        t2.displayTicket();

        // Cancel ticket
        t1.cancelTicket();

        // Display updated layout
        branch1.displayCinema();
    }
}