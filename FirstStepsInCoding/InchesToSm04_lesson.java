package FirstStepsInCoding;

import java.util.Scanner;

public class InchesToSm04_lesson {
    public static void main (String [] args){
        Scanner scanner = new Scanner ( System.in);
        double inch = Double.parseDouble(scanner.nextLine());
        double sm = inch * 2.54 ;
        System.out.println(sm);

    }
}
