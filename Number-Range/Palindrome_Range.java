import java.util.Scanner;

public class Palindrome_Range {

    public static void main(String[] args) {
        int end;
        int start;


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter start Point");
        start= sc.nextInt();
        System.out.println("Enter End Point");
        end=sc.nextInt();

        if(start>end){
            System.out.println("Start must be smaller than the end");
            return;
        }


        for(int i=start;i<=end;i++) {
        int temp=i;
        int reverse=0;
            while (temp>0){
                reverse=reverse*10+ (temp%10);
                temp/=10;
            }
            if (i==reverse) System.out.print(i+" ");


        }
    }
}
