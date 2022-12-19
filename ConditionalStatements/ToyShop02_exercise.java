package ConditionalStatements;

import java.util.Scanner;

public class ToyShop02_exercise {
    public static void main (String[] args){
        Scanner scanner=new Scanner((System.in));

        double priceHoliday = Double.parseDouble(scanner.nextLine());
        int puzzle= Integer.parseInt(scanner.nextLine());
        int doll=Integer.parseInt(scanner.nextLine());
        int teddyBear =Integer.parseInt(scanner.nextLine());
        int minion=Integer.parseInt(scanner.nextLine());
        int lorry=Integer.parseInt(scanner.nextLine());
        int totalToys = puzzle+doll+teddyBear+minion+lorry;

        double pricePuzzle= puzzle*2.60;
        double priceDoll=doll*3.00;
        double priceTeddyBear= teddyBear*4.10;
        double priceMinion=minion*8.20;
        double priceLorry=lorry*2.00;

        double allPrice= pricePuzzle+priceDoll+priceTeddyBear+priceMinion+priceLorry;

        if (totalToys >=50){
            allPrice=allPrice-(0.25*allPrice);
        }

        double moneyLeft= allPrice-(0.10*allPrice);

        if(moneyLeft>=priceHoliday){
            System.out.printf("Yes! %.2f lv left.",moneyLeft-priceHoliday);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.",priceHoliday-moneyLeft);
        }

    }
}
