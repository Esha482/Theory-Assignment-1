import java.util.ArrayList;

public class CityCinema {
    String branchName;
    String city;
    String address;
    ArrayList screens; // raw ArrayList

    public CityCinema(String branchName, String city, String address) {
        this.branchName = branchName;
        this.city = city;
        this.address = address;
        screens = new ArrayList(); // raw ArrayList
    }

    public void addScreen(CinemaScreen screen) {
        screens.add(screen);
    }

    public ArrayList getScreens() {
        return screens;
    }

    public void displayCinema() {
        System.out.println("\nBranch: " + branchName + ", " + city + ", " + address);
        for (int i = 0; i < screens.size(); i++) {
            CinemaScreen screen = (CinemaScreen) screens.get(i); // type cast
            System.out.println("\nScreen ID: " + screen.screenID + " [" + screen.screenType + "]");
            System.out.println("Movie: " + screen.moviePlaying);
            screen.displaySeats();
        }
    }
}