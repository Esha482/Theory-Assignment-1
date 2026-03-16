import java.util.ArrayList;

public class CinemaScreen {
    String screenID;
    String screenType; // 2D, 3D, IMAX
    Movie moviePlaying;
    ArrayList seats; // raw ArrayList, <Seat> removed

    public CinemaScreen(String screenID, String screenType, Movie movie, int totalSeats) {
        this.screenID = screenID;
        this.screenType = screenType;
        this.moviePlaying = movie;
        seats = new ArrayList(); // raw ArrayList
        initializeSeats(totalSeats);
    }

    private void initializeSeats(int totalSeats) {
        for (int i = 1; i <= totalSeats; i++) {
            SeatType type;
            if (i <= 5)
                type = SeatType.VIP;
            else if (i <= 10)
                type = SeatType.PREMIUM;
            else
                type = SeatType.REGULAR;

            seats.add(new Seat("S" + i, type));
        }
    }

    public ArrayList getSeats() {
        return seats;
    }

    public void displaySeats() {
        for (int i = 0; i < seats.size(); i++) {
            Seat seat = (Seat) seats.get(i); // type cast
            System.out.print(seat + " | ");
        }
        System.out.println();
    }
}