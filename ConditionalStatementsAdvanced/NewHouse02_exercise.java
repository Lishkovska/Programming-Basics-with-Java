package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class NewHouse02_exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flower = scanner.nextLine();
        int countFlowers = Integer.parseInt(scanner.nextLine());
        int budjet = Integer.parseInt(scanner.next());

        double flowerPrice = 0;

        switch (flower) {
            case "Roses":
                flowerPrice = countFlowers * 5;
                if (countFlowers > 80) {
                    flowerPrice = flowerPrice - (0.1 * flowerPrice);
                }
                break;
            case "Dahlias":
                flowerPrice = countFlowers * 3.80;
                if (countFlowers > 90) {
                    flowerPrice = flowerPrice - (flowerPrice * 0.15);
                }
                break;
            case "Tulips":
                flowerPrice = countFlowers * 2.80;
                if (countFlowers > 80) {
                    flowerPrice = flowerPrice - (flowerPrice * 0.15);
                }
                break;
            case "Narcissus":
                flowerPrice = countFlowers * 3;
                if (countFlowers < 120) {
                    flowerPrice = flowerPrice + (flowerPrice * 0.15);
                }
                break;
            case "Gladiolus":
                flowerPrice = countFlowers * 2.50;
                if (countFlowers < 80) {
                    flowerPrice = flowerPrice + (flowerPrice * 0.2);
                }
                break;
        }
        if (flowerPrice <= budjet) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", countFlowers, flower, budjet -
                    flowerPrice);

        } else
            System.out.printf("Not enough money, you need %.2f leva more.", flowerPrice - budjet);
    }
}
