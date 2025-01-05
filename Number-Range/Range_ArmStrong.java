import java.util.Scanner;

public class Range_ArmStrong {

    public static void main(String[] args) {

        int end;
        int start;


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
             int count=0;
             int sum=0;

             while (temp>0){
                 count++;
                 temp/=10;
             }
             temp=i;

             while (temp>0){
                 int result=1;

                 for (int j=1;j<=count;j++){
                     result*=temp%10;
                 }
                 sum+=result;
                 temp/=10;

             }
             if (sum==i){
                 System.out.print(i+ " ");
             }

        }




    }
}
