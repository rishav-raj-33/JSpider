/*
 *
 *        ---*
 *        ---**
 *        ---***              -  => gap
 *        ---****
 * */


import java.util.Scanner;

public class Gap_RightAngleTriangle {


    public static void main(String[] args) {
        System.out.println("Enter Size");
        int size=new Scanner(System.in).nextInt();

        for (int i=0;i<size;i++){
            for (int j=1;j<=3;j++) System.out.print(" ");
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
