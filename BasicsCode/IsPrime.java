import java.util.Scanner;

public class IsPrime {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Number");
        int a=sc.nextInt();
        boolean flag=true;

        for(int i=2;i<a/2;i++){
            if(a%i==0){
                flag=false;
                break;
            }
        }

        if (a>1 && flag){
            System.out.println("Prime Number");
        } else {
            System.out.println("not a Prime Number");
        }



    }
}
