import java.util.Scanner;

public class Fibo_Series_Upto_Number {


    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int n= sc.nextInt();
        while (a<=n){
            System.out.println(a);
            c=a+b;
            a=c;
        }


    }
}
