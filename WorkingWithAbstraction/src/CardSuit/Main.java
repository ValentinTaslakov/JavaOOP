package CardSuit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Card Suits:");

        Suits[] cardSuits = Suits.values();

        for (int i = 0; i < Suits.values().length; i++) {

            System.out.printf("Ordinal value: %d; Name value: %s%n"
                    , cardSuits[i].ordinal(),cardSuits[i]);

        }
    }
}
