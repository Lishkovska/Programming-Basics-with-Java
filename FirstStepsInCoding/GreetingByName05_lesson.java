package FirstStepsInCoding;

import java.util.Scanner;

public class GreetingByName05_lesson {
    public static void main (String [] args){
        Scanner scanner = new Scanner ( System.in);
        String name= scanner.nextLine();
        System.out.println("Hello,"+ " " + name + '!');
    }
}
