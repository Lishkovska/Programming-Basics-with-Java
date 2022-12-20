package ForLoop;

import java.util.Scanner;

public class Salary02_exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        int salary=Integer.parseInt(scanner.nextLine());
        int totalSalary=salary;

        for (int i=1 ; i<=n ; i++){
            String nameTab=scanner.nextLine();

            if (nameTab.equals("Facebook")){
                totalSalary=totalSalary-150;
            }else if (nameTab.equals("Instagram")){
                totalSalary=totalSalary-100;
            }else if (nameTab.equals("Reddit")){
                totalSalary=totalSalary-50;
            }
            if (totalSalary<=0){
                break;
            }
        }
        if (totalSalary>0){
            System.out.println(totalSalary);
        } else {
            System.out.println("You have lost your salary.");
        }
    }
}
