public class Seat {
    String seatID;
    SeatType seatType;
    boolean isAvailable;

    public Seat(String seatID, SeatType type) {
        this.seatID = seatID;
        this.seatType = type;
        this.isAvailable = true;
    }

    public void bookSeat() {
        isAvailable = false;
    }

    public void cancelSeat() {
        isAvailable = true;
    }

    public String toString() {
        return seatID + " [" + seatType + "] " + (isAvailable ? "Available" : "Booked");
    }
}