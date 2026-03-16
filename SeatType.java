enum SeatType{
    VIP(20),
    PREMIUM(15),
    REGULAR(10);

    private double price;

    SeatType(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}