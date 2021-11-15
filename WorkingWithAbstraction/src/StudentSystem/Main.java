package StudentSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(java.lang.System.in);

        System studentSystem = new System();

        String input = scanner.nextLine();

        while (!input.equals("Exit")) {

            String[] data = input.split("\\s+");

            studentSystem.ParseCommand(data);

            input = scanner.nextLine();
        }
    }
}
