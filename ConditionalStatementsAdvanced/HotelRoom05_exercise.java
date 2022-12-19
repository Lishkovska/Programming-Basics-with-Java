package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class HotelRoom05_exercise {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        String month=scanner.nextLine();
        int countNights=Integer.parseInt(scanner.nextLine());

        double studioPrice=0;
        double apartmentPrice=0;

        switch (month) {
            case "May":
            case "October":
                studioPrice = countNights * 50;
                apartmentPrice = countNights * 65;
                if (countNights > 14) {
                    studioPrice = studioPrice*0.70;
                    apartmentPrice=apartmentPrice*0.90;
                }
                else if (countNights>7){
                    studioPrice=studioPrice*0.95;

                } break;
            case "June":
            case "September":
                studioPrice=countNights*75.20;
                apartmentPrice=countNights*68.70;
                if(countNights>14){
                    studioPrice=studioPrice*0.80;
                    apartmentPrice=apartmentPrice*0.90;
                } break;
            case "July":
            case "August":
                studioPrice=countNights*76;
                apartmentPrice=countNights*77;
                if(countNights>14){
                    apartmentPrice=apartmentPrice*0.90;
                }
        }
        System.out.printf("Apartment: %.2f lv.%n",apartmentPrice);
        System.out.printf("Studio: %.2f lv.",studioPrice);
    }
}
