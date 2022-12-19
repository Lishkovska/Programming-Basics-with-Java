package FirstStepsInCoding;

import java.util.Scanner;

public class FishTank09_exercise {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double lenght = Double.parseDouble(scanner.nextLine());
        double witdth = Double.parseDouble(scanner.nextLine());
        double high = Double.parseDouble(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());
        double volume = lenght*witdth*high;
        double volumeL = volume /1000 ;
        double occupySpace = percent/100;
        double needL = volumeL * (1-occupySpace);
        System.out.println(needL);
    }
}
