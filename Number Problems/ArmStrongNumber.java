import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        int number;
        int temp;
        int count=0;
        int sum=0;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Number");
        number= sc.nextInt();
        temp=number;

        while (number>0){
            count++;
            number/=10;
        }
   number=temp;

        while (number>0){

            int result=1;


            for(int i=1;i<=count;i++){
                result*=number%10;

            }
            sum+=result;



            number/=10;
        }


        if(sum==temp){
            System.out.println("ArmStrong Number");
        } else {
            System.out.println("Not Arm Strong Number");
        }




    }
}
