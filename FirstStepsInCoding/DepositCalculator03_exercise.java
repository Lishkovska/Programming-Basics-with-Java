package FirstStepsInCoding;

import java.util.Scanner;

public class DepositCalculator03_exercise {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        double deposit = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());
        double lihva = deposit* (percent/100);
        double onemonth = lihva/12;
        double total = deposit + (months* onemonth);
        System.out.print(total);
    }
}
