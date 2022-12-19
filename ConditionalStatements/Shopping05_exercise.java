package ConditionalStatements;

import java.util.Scanner;

public class Shopping05_exercise {
    public static void main (String[] args){
        Scanner scanner=new Scanner(System.in);

        double budjet=Double.parseDouble(scanner.nextLine());
        int videocards=Integer.parseInt(scanner.nextLine());
        int procesor=Integer.parseInt(scanner.nextLine());
        int ram=Integer.parseInt(scanner.nextLine());

        double priceVideocards=videocards*250;
        double priceProcesor=0.35*priceVideocards*procesor;
        double priceRam=0.10*priceVideocards*ram;

        double totalPrice=priceVideocards+priceProcesor+priceRam;
//Ако броя на видеокартите е по-голям от този на процесорите получава 15% отстъпка от крайната сметка. Важат следните цени:
        if(videocards>procesor){
            totalPrice=totalPrice-(0.15*totalPrice);
        }
        if(totalPrice<=budjet){
            System.out.printf("You have %.2f leva left!",budjet-totalPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!",totalPrice-budjet,Math.abs(totalPrice-budjet));
        }
    }
}
