package WhileLoop;

import java.util.Scanner;

public class Coins05_exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double change=Double.parseDouble(scanner.nextLine());
        double changeInCoins=Math.round(change*100);
        int countCoins=0;

        while(changeInCoins>0){
            if(changeInCoins>=200){
                countCoins++;
                changeInCoins=changeInCoins-200;
            } else if(changeInCoins>=100){
                countCoins++;
                changeInCoins=changeInCoins-100;
            } else if(changeInCoins>=50){
                countCoins++;
                changeInCoins=changeInCoins-50;
            } else if(changeInCoins>=20){
                countCoins++;
                changeInCoins=changeInCoins-20;
            }else if(changeInCoins>=10){
                countCoins++;
                changeInCoins=changeInCoins-10;
            }else if(changeInCoins>=5){
                countCoins++;
                changeInCoins=changeInCoins-5;
            }else if(changeInCoins>=2){
                countCoins++;
                changeInCoins=changeInCoins-2;
            } else if(changeInCoins>=1){
                countCoins++;
                changeInCoins=changeInCoins-1;
            } else {
                break;
            }
        }
        System.out.println(countCoins);
    }
}

