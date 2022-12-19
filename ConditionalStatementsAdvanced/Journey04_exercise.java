package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class Journey04_exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budjet = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = " ";
        String typeOfAccomodation = " ";

        double totalPrice = 0;

        if (budjet <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                totalPrice = 0.30 * budjet;
                typeOfAccomodation = "Camp";
            } else if (season.equals("winter")) {
                totalPrice = 0.70 * budjet;
                typeOfAccomodation = "Hotel";
            }

        } else if (budjet > 100 && budjet <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                totalPrice = 0.40 * budjet;
                typeOfAccomodation = "Camp";
            } else if (season.equals("winter")) {
                totalPrice = 0.80 * budjet;
                typeOfAccomodation = "Hotel";
            }
        } else if (budjet > 1000) {
            destination = "Europe";
            if (season.equals("summer") || season.equals("winter")) {
                totalPrice = 0.90 * budjet;
                typeOfAccomodation = "Hotel";
            }
        }
        System.out.printf("Somewhere in %s%n", destination);

        System.out.printf("%s - %.2f", typeOfAccomodation, totalPrice);

    }
}
