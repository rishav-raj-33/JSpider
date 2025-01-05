/*
*         *     *
*          *  *
*           *
*         *   *
*        *     *
* */


import java.util.Scanner;

public class Assignment_Pattern_Q7 {


    public static void main(String[] args) {


        System.out.println("Enter Size");
        int size=new Scanner(System.in).nextInt();
        
        
        
        for (int i=1;i<=size;i++){
            for (int j = 1; j <=size ; j++) {

                if(i==j || (i+j==size+1)){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
        
        

    }
}
