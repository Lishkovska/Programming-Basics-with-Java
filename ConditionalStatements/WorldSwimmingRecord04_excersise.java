package ConditionalStatements;

import java.util.Scanner;

public class WorldSwimmingRecord04_excersise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double worldRecord = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeSm = Double.parseDouble(scanner.nextLine());

        double result=distance*timeSm;

        double slowDown = Math.floor (distance / 15);
        double slowDown2 = slowDown * 12.5;
        double finalResult=result+slowDown2;

        if (finalResult < worldRecord) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",
                    finalResult);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.",Math.abs(worldRecord-finalResult));
        }
    }
}
