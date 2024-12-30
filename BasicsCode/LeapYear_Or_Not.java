import java.util.Scanner;

public class LeapYear_Or_Not {


    public static void main(String[] args) {

        int year=0;

        Scanner sc=new Scanner(System.in);


        System.out.println("Enter year");
        year=sc.nextInt();

        if((year%400==0)||(year%4==0&&(year%100!=0))){
            System.out.println("Leap year");
        } else {
            System.out.println("Not Leap year");
        }



    }
}
