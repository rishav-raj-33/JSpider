package BasicsCode;


import java.util.Scanner;

// write a program to check eligibility of age.
public class Eligibility {


    public static void main(String[] args) {

        int age;

        Scanner a=new Scanner(System.in);
        System.out.println("Enter age");
        age=a.nextInt();

        if ((age>=20) &&(age<=30)){
            System.out.println("You are Eligible");
        }else {
            System.out.println("Not Eligible");
        }

    }
}
