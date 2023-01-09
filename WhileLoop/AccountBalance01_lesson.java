package WhileLoop;

import java.util.Scanner;

public class AccountBalance01_lesson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String currentMoney=scanner.nextLine();
        double totalMoney=0;

        while(!currentMoney.equals("NoMoreMoney")){
            double currentAmount=Double.parseDouble(currentMoney);
            if(currentAmount<=0){
                System.out.println("Invalid operation!");
                break;
            }

            System.out.printf("Increase: %.2f%n",currentAmount);

            totalMoney=totalMoney+currentAmount;

            currentMoney=scanner.nextLine();

        }
        System.out.printf("Total: %.2f",totalMoney);
    }
}
