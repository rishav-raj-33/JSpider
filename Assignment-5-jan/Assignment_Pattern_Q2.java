/*
*    1234
*    1234
*    1234
*    1234
* */


import java.util.Scanner;

public class Assignment_Pattern_Q2 {


    public static void main(String[] args) {

        System.out.println("Enter Size");
        int size=new Scanner(System.in).nextInt();

        for(int i=1;i<=size;i++){
            for (int j=1;j<=size;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
