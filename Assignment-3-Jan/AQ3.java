/*Write a program to print smallest digit in the whole Number*/

import java.util.Scanner;

public class AQ3 {

    public static void main(String[] args) {


        int number;
        int min=9;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Number");
        number= sc.nextInt();


        while (number>0){

            int digit=number%10;

            if(min>digit){
                min=digit;
            }
            number/=10;

        }


        System.out.println("Smallest Digit:"+min);

    }
}
