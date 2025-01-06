/*
*
*             1
*             3 2
*             4 5 6
*             10 9 8 7
*             11 12 13 14 15
*
* */


import java.util.Scanner;

public class PatternProgramQ1 {


    public static void main(String[] args) {

        System.out.println("Enter Size");
        int size=new Scanner(System.in).nextInt();
        int number=1;



        for(int i=1;i<=size;i++){



            for (int j = 1; j <=i ; j++) {
                if (i%2!=0){
                    System.out.print(number+" ");
                    number++;

                } else {
                    System.out.print(number+" ");
                    number--;

                }

            }
            if(i%2!=0){
               number= (number+i);
            } else {
                number=number+i+1;
            }





            System.out.println();
        }
    }
}
