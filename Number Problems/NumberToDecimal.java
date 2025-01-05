import java.util.Scanner;

//Write a program to convert Positive Integer into binary.


public class NumberToDecimal {


    public static void main(String[] args) {
        int number;

        Scanner sc=new Scanner(System.in);
        int sum=0;
        int i=1;
        System.out.println("Enter Number");
        number= sc.nextInt();

        while (number>0){
            sum+=number%2*i;
            i*=10;
            number/=2;
        }

        System.out.println(sum);



    }
}
