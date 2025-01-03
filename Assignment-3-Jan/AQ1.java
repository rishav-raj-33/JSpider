/*Write a java program to print succeeding value if given number is positive even number and print preceding value if the number is negative
*  odd.
*
* input: 5                              input -11
* output: 8 10 12                      output -13 -15 -17
*  */


import java.util.Scanner;

public class AQ1 {


    public static void main(String[] args) {

        int number;
        int count=1;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Number");
        number= sc.nextInt();

        if((number>0) && (number%2==0)){
            number++;
            while (count<=3) {

                if (number%2==0) {
                    System.out.print(number+ " ");
                    count++;
                }
                number++;
            }
        } else if ((number<0) && (number%2!=0)) {
            number--;
            while (count<=3) {

                if (number%2!=0) {
                    System.out.print(number+ " ");
                    count++;
                }
                number--;
            }

        }









    }
}
