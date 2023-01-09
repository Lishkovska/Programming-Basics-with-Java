package WhileLoop;

import java.util.Scanner;

public class OldBooks01_exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String  wantedBook=scanner.nextLine();
        int bookCount=0;
        boolean isFound=false;

        String input=scanner.nextLine();
        while(!input.equals("No More Books")){
            if (!input.equals(wantedBook)){
                bookCount++;
            } else {
                isFound=true;
                break;
            }
            input=scanner.nextLine();
        }
        if(isFound){
            System.out.printf("You checked %d books and found it.",bookCount);
        }else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.",bookCount);
        }
    }
}

