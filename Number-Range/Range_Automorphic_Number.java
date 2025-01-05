import java.util.Scanner;

public class Range_Automorphic_Number {


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

            int power=i*i;
            int temp=i;
            boolean flag=true;

            while (temp>0){

                if(!(temp%10==power%10)){
                    flag=false;
                    break;
                }
                temp/=10;
                power/=10;
        }
            if(flag) System.out.print(i+" ");
        }
    }
}
