import java.util.Scanner;

public class Range_SpyNumber {


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

            int sum=0;
            int product=1;
            int temp=i;

            while (temp>0){
                int r=temp%10;
                sum+=r;
                product*=r;
                temp/=10;
            }
       if(sum==product) System.out.print(i+" ");

        }


    }
}
