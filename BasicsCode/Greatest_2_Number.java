package BasicsCode;

import java.util.Scanner;

public class Greatest_2_Number {

    public static void main(String[] args) {
        int a;
        int b;
        Scanner c=new Scanner(System.in);
        System.out.println("Enter first Number");
        a=c.nextInt();
        System.out.println("Enter second Number");
        b=c.nextInt();

        if(a>b){
            System.out.println(a+" is greater than "+b);
        } else {
            System.out.println(b+" is greater than "+a);


        }


    }
}
