import java.util.Scanner;

public class Count_Digits {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("Enter Number");
        int a=sc.nextInt();


        while (a>0){
            count++;
            a/=10;
        }

        System.out.println(count);
    }

    }

