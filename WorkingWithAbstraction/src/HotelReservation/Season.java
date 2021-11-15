package HotelReservation;

public enum Season {
    AUTUMN (1),
    SPRING (2),
    WINTER (3),
    SUMMER (4);

    private  int multiply;

    Season(int i ) {
        this.multiply = i;
    }

    public int getMultiply() {
        return multiply;
    }
}
