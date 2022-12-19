package FirstStepsInCoding;

import java.util.Scanner;

public class VacationBookList04_exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int daysForReading = Integer.parseInt(scanner.nextLine());
        int hours = pages / pagesPerHour;
        int hoursPerDay = hours/daysForReading;
        System.out.println(hoursPerDay);

    }
}
