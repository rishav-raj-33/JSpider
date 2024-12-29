package BasicsCode;

import java.util.Scanner;

public class Greatest_of_3 {

    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first number");
        a=sc.nextInt();


        System.out.println("Enter second number");
        b=sc.nextInt();

        System.out.println("Enter third number");
        c=sc.nextInt();

        if((a>b)&& (a>c)){
            System.out.println(a+" is greater than "+ b +" and "+ c);
        } else if (b>c){
            System.out.println(b+" is greater than "+ a +" and "+ c);

        } else {
            System.out.println(c+" is greater than "+ a +" and "+ b);

        }

    }
}
