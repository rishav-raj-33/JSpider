import java.util.Scanner;

public class Single_Digit {

    static Scanner sc=new Scanner(System.in);


    public static void main(String[] args) {


        int sum=0;
        System.out.println("Enter Number");
        int a=sc.nextInt();


        while (a>0){
            sum+=a%10;
            a/=10;

            if(a==0 && sum>=9 ){
                a=sum;
                sum=0;
            }

        }

        System.out.println(sum);

        second_method();


    }



    public static void second_method(){

        int sum=0;
        System.out.println("Enter Number");
        int a=sc.nextInt();

        do{
            while (a>0){
                sum+=a%10;
                a/=10;
            }
            a=sum;
        } while (a>=9);
        System.out.println(sum);

    }
}
