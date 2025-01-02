import java.util.Scanner;

public class SpyNumber {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int number=sc.nextInt();
        int sum=0;
        int product=1;

        while (number>0){
            sum+=number%10;
            product*=number%10;
            number=number/10;
        }

        if(sum==product){
            System.out.println("Spy Number");
        } else {
            System.out.println("Not a Spy Number");
        }



    }
}
