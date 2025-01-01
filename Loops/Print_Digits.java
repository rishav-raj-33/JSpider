import java.util.Scanner;

public class Print_Digits {

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int a=sc.nextInt();


        while (a>0){
            System.out.print((a%10)+" ");
            a/=10;
        }




    }
}
