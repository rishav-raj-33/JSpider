import java.util.Scanner;

public class Adding_N_Number {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

       int sum=0;
        System.out.println("Enter Number");
        int a=sc.nextInt();

        for(int i=0;i<=a;i++){

            sum+=i;

        }
        System.out.println("result"+sum);

    }
}
