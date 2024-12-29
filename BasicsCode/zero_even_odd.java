package BasicsCode;

import java.util.Scanner;

public class zero_even_odd {


    public static void main(String[] args) {
        int number;
        Scanner c=new Scanner(System.in);
        System.out.println("Enter Number");
        number=c.nextInt();
        if(number==0){
            System.out.println("Number is 0");
        } else if ((number&1)==1) {
            System.out.println("Number is odd");
        } else {
            System.out.println("Number is Even");
        }

    }
}
