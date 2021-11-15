package HotelReservation;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");

        double pricePerDay = Double.parseDouble(input[0]);

        int numberOfDays = Integer.parseInt(input[1]);

        Season season = Season.valueOf(input[2].toUpperCase(Locale.ROOT));

        DiscountType discount = DiscountType.valueOf(input[3].toUpperCase(Locale.ROOT));

        String totalPrice = PriceCalculator.calculate(pricePerDay,numberOfDays
                ,season,discount);

        System.out.println(totalPrice);
    }
}
