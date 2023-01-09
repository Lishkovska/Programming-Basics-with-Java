package WhileLoop;

import java.util.Scanner;

public class Cake06_exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int witgh=Integer.parseInt(scanner.nextLine());
        int length=Integer.parseInt(scanner.nextLine());
        String command=scanner.nextLine();

        int cakesInTotal=witgh * length;
        boolean noMoreCake=false;

        while(!command.equals("STOP") ){
            int pieces=Integer.parseInt(command);
            cakesInTotal=cakesInTotal-pieces;
            if(cakesInTotal<0){
                noMoreCake=true;
                break;
            }
            command=scanner.nextLine();
        }
        if(noMoreCake){
            System.out.printf("No more cake left! You need %d pieces more.",Math.abs(cakesInTotal));
        } else {
            System.out.printf("%d pieces are left.",cakesInTotal);
        }
    }
}



