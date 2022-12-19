package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class SummerOutfit01_exercise {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int degree=Integer.parseInt(scanner.nextLine());
        String dayTime=scanner.nextLine();
        String clothes=" ";
        String shoes=" ";

        if (dayTime.equals("Morning")){
            if (degree>=10&&degree<=18){
                clothes="Sweatshirt";
                shoes="Sneakers";
            }
            else if(degree>18&&degree<=24){
                clothes="Shirt";
                shoes="Moccasins";
            }
            else if(degree>=25){
                clothes="T-Shirt";
                shoes="Sandals";
            }

        } else if(dayTime.equals("Afternoon")){
            if(degree>=10&&degree<=18){
                clothes="Shirt";
                shoes="Moccasins";

            }
            else if(degree>18&&degree<=24){
                clothes="T-Shirt";
                shoes="Sandals";
            }else if(degree>=25){
                clothes="Swim Suit";
                shoes="Barefoot";
            }

        } else if(dayTime.equals("Evening")){
            if(degree>=10&&degree<=18){
                clothes="Shirt";
                shoes="Moccasins";
            }
            else if(degree>18&&degree<=24){
                clothes="Shirt";
                shoes="Moccasins";
            }
            else if(degree>=25){
                clothes="Shirt";
                shoes="Moccasins";
            }
        }
        System.out.printf("It's %d degrees, get your %s and %s.",degree,clothes,shoes);
    }
}
