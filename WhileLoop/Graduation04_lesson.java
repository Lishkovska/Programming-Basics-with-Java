package WhileLoop;

import java.util.Scanner;

public class Graduation04_lesson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOfStudent = scanner.nextLine();
        int year = 1;
        int badGrade=0;
        double sum=0;

        while (year<=12) {

            if(badGrade==2){
                break;
            }
            double currentGrade=Double.parseDouble(scanner.nextLine());

            if(currentGrade<4){
                badGrade++;
                continue;
            }
            sum=sum+currentGrade;
            year++;
        }
        if(badGrade==2){
            System.out.printf("%s has been excluded at %d grade",nameOfStudent,year);
        } else {
            double avrGrade=sum/(year-1);

            System.out.printf("%s graduated. Average grade: %.2f",nameOfStudent,avrGrade);
        }
    }
}

