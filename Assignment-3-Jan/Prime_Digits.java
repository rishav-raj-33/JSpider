/*Write a program to print prime digits in a number*/


import java.util.Scanner;

public class Prime_Digits {

    public static void main(String[] args) {
        int number;
        boolean flag=true;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Number");
        number= sc.nextInt();

        while (number>0){

            int r=number%10;

            for (int i=2;i<r/2;i++){
                if(r%i==0){
                    flag=false;
                    break;
                }


            }

            if(flag){
                System.out.print(r+" ");

            } else {
                flag=true;
            }

            number/=10;
        }


    }
}
