package HotelReservation;

public enum DiscountType {
    VIP (0.8),
    SECONDVISIT(0.9),
    NONE (1.0);

    private double percent;

    DiscountType(double v) {

        this.percent = v;

    }

    public double getPercent() {


        return percent;
    }

}
