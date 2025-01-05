//ArmStrong Between given Range..


import java.util.Scanner;

public class Range_Strong {

    public static void main(String[] args) {
        int end;
        int start;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter start Point");
        start= sc.nextInt();
        System.out.println("Enter End Point");
        end=sc.nextInt();

        if(end<start){
            System.out.println("Start Must be smaller than the end");
            return;
        }


        for(int i=start;i<=end;i++){

            int temp=i;
            while (temp>0){

                int digit=temp%10;
                int fact=1;
                for(int k=1;k<=digit;k++){
                    fact*=k;
                }

                sum+=fact;
                temp/=10;
            }

            if(i==sum){
                System.out.print(i+" ");
            }

            sum=0;




        }




    }
}
