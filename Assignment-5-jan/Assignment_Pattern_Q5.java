/*
*    12345
*    54321
*    12345
*    54321
*
*
* */


import java.util.Scanner;

public class Assignment_Pattern_Q5 {

    public static void main(String[] args) {

        System.out.println("Enter Size");
        int size=new Scanner(System.in).nextInt();
        int number=1;

        for(int i=1;i<=size;i++){
            for (int j=1;j<=size;j++){
                if(i%2!=0){
                    System.out.print(j);
                    number++;
                } else {
                    System.out.print(--number);
                }
            }
            System.out.println();
        }


    }
}
