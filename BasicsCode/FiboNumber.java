import java.util.Scanner;

public class FiboNumber {


    public static void main(String[] args) {
        int a=0;
        int b=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your desired Maximum number");
        int n=sc.nextInt();


        System.out.println(a);
        System.out.println(b);
        for(int i=1;i<=n-2;i++){
            System.out.println(a+b);
            int c=b;
            b=a+b;
            a=c;

        }

    }
}
