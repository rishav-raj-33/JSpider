import java.util.Scanner;

public class Range_Neon_Number {

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

            int square=i*i;
            int sum=0;
            while (square>0){
                sum+=square%10;
                square/=10;
            }
            if(sum==i) System.out.print(i+" ");


        }
        }
    }

