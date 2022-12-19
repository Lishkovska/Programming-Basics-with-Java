package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class FruitShop05_lesson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quontity = Double.parseDouble(scanner.nextLine());

        double price = 0;
        //banana apple orange grapefruit kiwi pineapple grapes
        //2.50 1.20 0.85 1.45 2.70 5.50 3.85

        boolean isWorkingDay = day.equals("Monday") || day.equals("Tuesday")
                || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday");

        boolean isWeekendDay = day.equals("Saturday") || day.equals("Sunday");

        boolean isValid = true;

        if (isWorkingDay) {
            if (fruit.equals("banana")) {
                price = 2.50;
            } else if (fruit.equals("apple")) {
                price = 1.20;
            } else if (fruit.equals("orange")) {
                price = 0.85;
            } else if (fruit.equals("grapefruit")) {
                price = 1.45;
            } else if (fruit.equals("kiwi")) {
                price = 2.70;
            } else if (fruit.equals("pineapple")) {
                price = 5.50;
            } else if (fruit.equals("grapes")) {
                price = 3.85;
            }
        } else if (isWeekendDay) {
            if  (fruit.equals("banana")) {
                price = 2.70;
            } else if (fruit.equals("apple")) {
                price = 1.25;
            } else if (fruit.equals("orange")) {
                price = 0.90;
            } else if (fruit.equals("grapefruit")) {
                price = 1.60;
            } else if (fruit.equals("kiwi")) {
                price = 3;
            } else if (fruit.equals("pineapple")) {
                price = 5.60;
            } else if (fruit.equals("grapes")) {
                price = 4.20;
            } else {
                isValid = false;
            }

        } else {
            isValid = false;
        }

        if (isValid) {
            double result = price * quontity;
            System.out.printf("%.2f", result);
        } else {
            System.out.println("error");
        }
    }
}