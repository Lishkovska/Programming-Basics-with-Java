package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class TradeComissions06_lesson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double volumeOfSales = Double.parseDouble(scanner.nextLine());

        boolean isValid = true;
        double tradeComission = 0;

        if (city.equals("Sofia")) {
            if (volumeOfSales >= 0 && volumeOfSales <= 500) {
                tradeComission = 0.05 * volumeOfSales;
            } else if (volumeOfSales > 500 && volumeOfSales <= 1000) {
                tradeComission = 0.07 * volumeOfSales;
            } else if (volumeOfSales > 1000 && volumeOfSales <= 10000){
                tradeComission = 0.08 * volumeOfSales;
            }else if (volumeOfSales > 10000) {
                tradeComission = 0.12 * volumeOfSales;
            } else {
                isValid = false;
            }
        } else if (city.equals("Varna")) {
            if (volumeOfSales >= 0 && volumeOfSales <= 500) {
                tradeComission = 0.045 * volumeOfSales;
            } else if (volumeOfSales > 500 && volumeOfSales <= 1000) {
                tradeComission = 0.075 * volumeOfSales;
            } else if (volumeOfSales > 1000 && volumeOfSales <= 10000) {
                tradeComission = 0.10 * volumeOfSales;
            } else if (volumeOfSales > 10000) {
                tradeComission = 0.13 * volumeOfSales;
            } else {
                isValid=false;}

        }
        else if (city.equals("Plovdiv")) {
            if (volumeOfSales >= 0 && volumeOfSales <= 500) {
                tradeComission = 0.055 * volumeOfSales;
            } else if (volumeOfSales > 500 && volumeOfSales <= 1000) {
                tradeComission = 0.08 * volumeOfSales;
            } else if (volumeOfSales > 1000 && volumeOfSales <= 10000) {
                tradeComission = 0.12 * volumeOfSales;
            } else if (volumeOfSales > 10000) {
                tradeComission = 0.145 * volumeOfSales;
            } else {
                isValid = false;
            }

        }  else {
            isValid=false;
        }

        if(isValid){
            System.out.printf("%.2f",tradeComission);
        } else{
            System.out.println("error");
        }
    }
}
