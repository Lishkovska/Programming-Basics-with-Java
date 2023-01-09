package WhileLoop;

import java.util.Scanner;

public class Vacation03_exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vacationMoney = Double.parseDouble(scanner.nextLine());
        double firstTimeMoney = Double.parseDouble(scanner.nextLine());
        int spendCount = 0;
        int daysCount = 0;

        double sum = 0;

        while (firstTimeMoney < vacationMoney && spendCount<5) {
            String command = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());
            daysCount++;

            if (command.equals("save")) {
                firstTimeMoney = firstTimeMoney + money;
                spendCount = 0;
            } else if (command.equals("spend")) {
                firstTimeMoney = firstTimeMoney - money;
                spendCount++;
            }
            if (firstTimeMoney < 0) {
                firstTimeMoney = 0;
            }
        }
        if (spendCount == 5) {
            System.out.println("You can't save the money.");
            System.out.print(daysCount);
        } else {
            System.out.printf("You saved the money for %d days.", daysCount);
        }
    }
}

