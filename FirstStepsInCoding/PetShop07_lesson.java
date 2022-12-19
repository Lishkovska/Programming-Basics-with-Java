package FirstStepsInCoding;

import java.util.Scanner;

public class PetShop07_lesson {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        int dog = Integer.parseInt(scanner.nextLine());
        int cat= Integer.parseInt(scanner.nextLine());
        double totalDog = dog * 2.50;
        double totalCat = cat* 4;
        double totalAmmount = totalDog + totalCat;
        System.out.print( totalAmmount + " " + "lv");
    }
}
