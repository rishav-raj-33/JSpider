/*
*
*   1 2 3 4 5
*   10 9 8 7 6
*   11 12 13 14
*   20 19 18 17 16
* */


import java.util.Scanner;

public class Assignment_Pattern_Q4 {


    public static void main(String[] args) {
        System.out.println("Enter Size");
        int size=new Scanner(System.in).nextInt();
        int number=1;
        int number2=size*2;


        for(int i=1;i<=size;i++){
            for (int j=1;j<=size;j++){
              if (i%2==0){
                  System.out.print(number2 + " ");
                  number2--;

              } else {
                  System.out.print(number + " ");
                  number++;
              }
            }

            if(i%2!=0){
                number+=size;
            } else {

                number2=number2+(3*size);
            }


            System.out.println();
        }






    }
}
