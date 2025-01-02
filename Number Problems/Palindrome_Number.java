import java.util.Scanner;

public class Palindrome_Number {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int number=sc.nextInt();
        int temp=number;
        int reverse=0;
        while (temp>0){
            reverse=reverse*10+(temp%10);
            temp=temp/10;
        }

        if (number==reverse){
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a palindrome Number");
        }

    }
}
