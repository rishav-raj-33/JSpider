//write a program ro convert Positive Integer


import java.util.Scanner;

public class BinaryToDecimal {


    public static void main(String[] args) {
        int number;
        int power=0;

        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter Bytes");
        number= sc.nextInt();

        for(int i=0;number>0;i++){

            if(i==0){
                power=1;
            } else  {
               power=(2<<i-1);
            }

            sum+=(number%10)*power;


            number/=10;
        }
        System.out.println(sum);
    }
}
