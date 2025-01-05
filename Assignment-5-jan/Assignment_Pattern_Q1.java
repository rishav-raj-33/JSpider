/*
*
*   1111
*   2222
*   3333
*   4444
* */


import java.util.Scanner;

public class Assignment_Pattern_Q1 {


    public static void main(String[] args) {
        System.out.println("Enter Size");
        int size=new Scanner(System.in).nextInt();

        for(int i=1;i<=size;i++){
            for (int j=1;j<=size;j++){
                System.out.print(i);
            }
            System.out.println();
        }

    }
}
