/*
*
*
*               1
*           1   2   1
*       1   2   3   2   1
*
* */


import java.util.Scanner;

public class PatternProblemQ2 {

    public static void main(String[] args) {

        System.out.println("Enter Size");
        int size=new Scanner(System.in).nextInt();
        int number=1;
        int space=size-1;

        for (int i = 1; i <=size ; i++) {
            for (int k = 0; k < space; k++){System.out.print(" ");}


            for (int j = 1; j <i ; j++) {
                System.out.print(number++);
            }
            for (int j = 1; j <i-1 ; j++) {
                number--;
                System.out.print(number-1);

            }
            space=space-1;
            number=1;
            System.out.println();
        }
    }
}
