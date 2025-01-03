/*Write a program to print biggest digit in the whole Number*/


import java.util.Scanner;

public class AQ2 {


    public static void main(String[] args) {

        int number;
        int max=0;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Number");
        number= sc.nextInt();

        while (number>0){

            int digit=number%10;

            if(max<digit){
                max=digit;
            }
            number/=10;

        }


        System.out.println("Biggest Digit:"+max);

    }
}
