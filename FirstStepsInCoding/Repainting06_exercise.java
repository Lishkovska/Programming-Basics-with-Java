package FirstStepsInCoding;

import java.util.Scanner;

public class Repainting06_exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int razreditel = Integer.parseInt(scanner.nextLine());
        int workingHours = Integer.parseInt(scanner.nextLine());
        double amountNylon = (nylon + 2) *1.50;
        double amountPaint = ( paint + 0.10* paint) *14.50;
        int amountRazreditel = razreditel * 5;
        double bags = 0.40;
        double totalAmount = amountNylon+amountPaint+amountRazreditel+bags;
        double amountWorkingHours = (totalAmount* 0.3)* workingHours;
        double allCosts = totalAmount+ amountWorkingHours;
        System.out.println(allCosts);



    }
}
