package FirstStepsInCoding;

import java.util.Scanner;

public class YardGreening08_lesson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double m3 = Double.parseDouble(scanner.nextLine());
        double totalAmount= 7.61 * m3;
        double discount = 0.18 * totalAmount;
        double finalOffer = totalAmount - discount;
        System.out.println("The final price is :"+ " "+ finalOffer +" "+ "lv."+ "The discount is :"
                + " "+ discount + " "+ "lv.");
    }
}
