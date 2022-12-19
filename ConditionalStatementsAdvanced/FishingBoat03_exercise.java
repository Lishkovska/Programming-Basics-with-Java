package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class FishingBoat03_exercise {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int budjet=Integer.parseInt(scanner.nextLine());
        String season=scanner.nextLine();
        int countFishermen=Integer.parseInt(scanner.nextLine());

        double totalPrice=0;

        switch (season){
            case "Spring":
                totalPrice=3000;
                break;
            case "Summer":
                totalPrice=4200;
                break;
            case "Autumn":
                totalPrice=4200;
                break;
            case"Winter":
                totalPrice=2600;
                break;
        }
        if (countFishermen<=6){
            totalPrice=totalPrice-(0.10*totalPrice);
        } else if(countFishermen>7&&countFishermen<=11){
            totalPrice=totalPrice-(0.15*totalPrice);
        }else if(countFishermen>12){
            totalPrice=totalPrice-(0.25*totalPrice);
        }
        if(countFishermen%2==0 && !(season.equals("Autumn"))){
            totalPrice=totalPrice-(0.05*totalPrice);
        }
        if(totalPrice<=budjet){
            System.out.printf("Yes! You have %.2f leva left.",budjet-totalPrice);

        } else {
            System.out.printf("Not enough money! You need %.2f leva.",totalPrice-budjet);
        }
    }
}
