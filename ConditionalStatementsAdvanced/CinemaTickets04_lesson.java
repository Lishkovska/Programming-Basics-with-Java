package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class CinemaTickets04_lesson {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        String day= scanner.nextLine();

        //Monday Tuesday Wednesday Thursday Friday Saturday Sunday
        //
        //12 12 14 14 12 16 16
        int priceTicket=0;

        if(day.equals("Monday")||
                day.equals("Tuesday")
                || day.equals("Friday")){
            priceTicket=12;

        }else if (day.equals("Wednesday")
                ||day.equals("Thursday")){
            priceTicket=14;
        }else if (day.equals("Saturday")
                ||day.equals("Sunday")){
            priceTicket=16;
        }
        System.out.println(priceTicket);

    }
}
