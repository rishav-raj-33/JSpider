/*
*       *****
*       ****
*       ***
*       **
*       *
* */


import java.util.Scanner;

public class InvertedTriangle {


    public static void main(String[] args) {
        System.out.println("Enter Size");
        int size=new Scanner(System.in).nextInt();


        for (int i = 1; i <=size; i++) {
            for(int j=size;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }


        withoutMinus(size);

    }

    public static void withoutMinus(int size){
        for (int i = 1; i <=size; i++) {
            for(int j=i;j<size;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    }


