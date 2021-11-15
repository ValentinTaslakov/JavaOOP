package TrafficLights;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Color[] signals = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Color::valueOf)
                .toArray(Color[]::new);

        List<TrafficLight> trafficLights = new ArrayList<>();

        for (Color signal : signals) {

            TrafficLight trafficLight = new TrafficLight(signal);

            trafficLights.add(trafficLight);
        }

        int n = Integer.parseInt(scan.nextLine());

        while (n -- >0){

            for (TrafficLight trafficLight : trafficLights) {

                trafficLight.changeColor();

                System.out.print(trafficLight + " ");
            }
            System.out.println();
        }
    }
}
