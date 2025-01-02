import java.util.Scanner;

public class Sum_Even_Odd {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int number=sc.nextInt();
        int evenSum=0;
        int oddSum=0;

        while (number>0){
            int r=number%10;
            if(r%2==0){
                evenSum+=r;
            } else {
                oddSum+=r;
            }

            number=number/10;
        }

        System.out.println(evenSum);
        System.out.println(oddSum);


    }
}
