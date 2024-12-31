import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int product=1;
        System.out.println("Enter number");
        int a=sc.nextInt();

        for(int i=1;i<=a;i++){
            product*=i;

        }
        System.out.println(product);
    }
}
