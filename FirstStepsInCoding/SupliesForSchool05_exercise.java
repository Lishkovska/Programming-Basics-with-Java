package FirstStepsInCoding;

import java.util.Scanner;

public class SupliesForSchool05_exercise {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int cleaning= Integer.parseInt(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());
        double pricePens = pens * 5.80 ;
        double priceMarkers = markers * 7.20 ;
        double priceCleaning = cleaning * 1.20 ;
        double priceTotal = pricePens+ priceMarkers +priceCleaning;
        double percent = discount/100 ;
        double priceDiscount = priceTotal - (priceTotal* percent);
        System.out.println(priceDiscount);
    }
}
