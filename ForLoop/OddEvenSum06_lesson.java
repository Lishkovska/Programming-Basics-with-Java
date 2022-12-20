package ForLoop;

import java.util.Scanner;

public class OddEvenSum06_lesson {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sumEven=0;
        int sumOdd=0;

        for(int i=1 ; i<=n ; i++){
            int currentNum=Integer.parseInt(scanner.nextLine());

            if (i %2==0 ){
                sumEven=sumEven+currentNum;
            } else {
                sumOdd=sumOdd+currentNum;
            }
        }
        if (sumEven==sumOdd){
            System.out.println("Yes");
            System.out.printf("Sum = %d",sumEven);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d",Math.abs(sumEven-sumOdd));
        }
    }
}
