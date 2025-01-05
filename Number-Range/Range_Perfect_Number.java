import java.util.Scanner;

public class Range_Perfect_Number {

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


        for(int i=start;i<=end;i++){
            int sum=0;
            for(int j=1;j<=i/2;j++){

                if(i%j==0){
                    sum+=j;
                }

            }
            if(sum==i) System.out.print(i+" ");
        }
    }

}
