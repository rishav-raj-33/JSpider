import java.util.Scanner;

public class MatrixPattern {


    /*     ***
    *      ***
    *      ***        */

    public static void main(String[] args) {

        System.out.println("Enter Size");
       int size= new Scanner(System.in).nextInt();


       for (int i=0;i<size;i++){
           for (int j=0;j<size;j++){
               System.out.print("*");
           }
           System.out.println();
       }

    }
}
