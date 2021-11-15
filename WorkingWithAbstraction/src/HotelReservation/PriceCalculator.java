package HotelReservation;

public class PriceCalculator {

    public static String calculate(double pricePerDay
            , int numberOfDays, Season season, DiscountType discount) {

        double total = pricePerDay * numberOfDays
                * season.getMultiply() * discount.getPercent();

        return String.format("%.2f",total);
    }


}
