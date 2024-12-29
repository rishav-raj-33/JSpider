package BasicsCode;

import java.util.Scanner;

public class CurrencyCalculator {

    public static void main(String[] args) {
        Scanner c=new Scanner(System.in);
        int amount;

        System.out.println("Enter amount");
        amount=c.nextInt();
        if(amount>=2000){
            System.out.println("The total number of 2000 is:"+amount/2000);
            amount%=2000;
        }
        if(amount>=500){
            System.out.println("The total number of 2000 is:"+amount/500);
            amount%=500;
        }
        if(amount>=200){
            System.out.println("The total number of 2000 is:"+amount/200);
            amount%=200;
        }
        if(amount>=100){
            System.out.println("The total number of 2000 is:"+amount/100);
            amount%=100;
        }
    }
}
