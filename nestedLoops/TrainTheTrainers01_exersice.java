package nestedLoops;

import java.util.Scanner;

public class TrainTheTrainers01_exersice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juree=Integer.parseInt(scanner.nextLine());

        int countAllGrades=0;
        double totalSumAllGrades=0;
        String input=scanner.nextLine();

        while (!input.equals("Finish")){
            String presentation=input;
            double allGrades=0;

            for(int i =1 ; i<=juree ;i++){
                double currentGrade=Double.parseDouble(scanner.nextLine());
                countAllGrades++;

                allGrades=allGrades+currentGrade;
            }
            totalSumAllGrades=totalSumAllGrades+allGrades;
            double avrGradeCurrent=allGrades/juree;

            System.out.printf("%s - %.2f.%n",presentation,avrGradeCurrent);
            input=scanner.nextLine();
        }
        double finalGrade=totalSumAllGrades/countAllGrades;
        System.out.printf("Student's final assessment is %.2f.",finalGrade);
    }
}


