package FirstStepsInCoding;

import java.util.Scanner;

public class BasketballEquipment08_exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int trainForYear = Integer.parseInt(scanner.nextLine());
        double trainers = trainForYear - (0.40* trainForYear);
        double equipment = trainers-(0.20*trainers);
        double ball = 0.25 * equipment;
        double accessories = 0.20 * ball ;
        double totalAmount = trainForYear+trainers+equipment+ball+accessories;
        System.out.println(totalAmount);

    }
}
