package ConditionalStatements;

import java.util.Scanner;

public class LunchBreak06_exercise {
    public static void main (String[] args){
        Scanner scanner=new Scanner(System.in);

        String tvShowName= scanner.nextLine();
        int episode=Integer.parseInt(scanner.nextLine());
        int lunchBreak=Integer.parseInt(scanner.nextLine());

        double timeForLunch=lunchBreak/8.0;
        double timeForRest=lunchBreak/4.0;
        double remainingTime=lunchBreak-timeForLunch-timeForRest;

        double difference=Math.abs(remainingTime-episode);

        if(remainingTime>=episode){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",
                    tvShowName,Math.ceil(difference));

        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",
                    tvShowName,Math.ceil(difference));
        }
    }
}
