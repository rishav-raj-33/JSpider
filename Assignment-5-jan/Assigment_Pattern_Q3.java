/*
*    1
*    2 3
*    4 5 6
*    7 8 9 10
*
*
*
* */


import java.util.Scanner;

public class Assigment_Pattern_Q3 {


    public static void main(String[] args) {

        int number=1;

        System.out.println("Enter Size");
        int size=new Scanner(System.in).nextInt();

      for (int i=1;i<=size;i++){
          for(int j=1;j<=i;j++){
              System.out.print(number+" ");
              number++;

          }
          System.out.println();
      }

    }
}
