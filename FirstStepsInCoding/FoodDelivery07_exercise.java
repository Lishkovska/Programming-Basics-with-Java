package FirstStepsInCoding;

import java.util.Scanner;

public class FoodDelivery07_exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chicken = Integer.parseInt(scanner.nextLine());
        int fish = Integer.parseInt(scanner.nextLine());
        int veggie = Integer.parseInt(scanner.nextLine());
        double priceChicken = chicken *10.35;
        double priceFish = fish *12.40;
        double priceVeggie = veggie * 8.15;
        double totalPriceAllMenus = priceChicken+ priceFish+priceVeggie;
        double priceDessert = 0.2 * totalPriceAllMenus;
        double delivery = 2.50;
        double allPrice = totalPriceAllMenus + priceDessert+ delivery;
        System.out.println(allPrice);

    }
}
