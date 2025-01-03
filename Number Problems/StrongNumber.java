import java.util.Scanner;

public class StrongNumber {


    public static void main(String[] args) {
        int number;
        int temp;
        int sum=0;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Number");
        number= sc.nextInt();
        temp=number;

        while (number>0){

            int digit=number%10;
            int fact=1;
            for(int i=1;i<=digit;i++){
                fact*=i;
            }
            sum+=fact;

            number/=10;
        }


        if (sum==temp){
            System.out.println("Strong Number");
        } else {
            System.out.println("Not Strong Number");
        }
    }
}
