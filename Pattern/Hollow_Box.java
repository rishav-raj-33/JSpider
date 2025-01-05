/*      *****
*      *     *
*      *     *
*      *     *
*       *****
* */


import java.util.Scanner;

public class Hollow_Box {


    public static void main(String[] args) {
        System.out.println("Enter Size");
        int size=new Scanner(System.in).nextInt();

        for (int i=0;i<size;i++){
            if(i==0 || i==size-1){
                for (int j=0;j<size;j++){
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (int k=1;k<=size-2;k++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
