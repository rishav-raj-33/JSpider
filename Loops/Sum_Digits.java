import java.util.Scanner;

public class Sum_Digits {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int sum=0;
        System.out.println("Enter Number");
        int a=sc.nextInt();


        while (a>0){
            sum+=a%10;
            a/=10;
        }

        System.out.println(sum);
    }
}
