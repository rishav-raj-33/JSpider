/*
*     5*4*3*2*1
*     5*4*3*2
*     5*4*3
*     5*4
*     5
* */


import java.util.Scanner;

public class Assignment_Pattern_Q6 {


    public static void main(String[] args) {
        System.out.println("Enter Size");
        int size=new Scanner(System.in).nextInt();


        for (int i=1;i<=size;i++){
            for (int j=size;j>=i;j--){
                System.out.print(j);

            if(!(i==j)){
                System.out.print("*");
            }

            }
            System.out.println();
        }

    }
}
