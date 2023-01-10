package nestedLoops;

import java.util.Scanner;

public class Travelling02_lesson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine();

        while(!input.equals("End")){
            String destination=input;
            double budjet=Double.parseDouble(scanner.nextLine());

            double totalSum=0;
            while(totalSum<budjet){
                double currentSum=Double.parseDouble(scanner.nextLine());
                totalSum=totalSum+currentSum;

            }
            System.out.printf("Going to %s!%n",destination);

            input=scanner.nextLine();
        }
    }
}
