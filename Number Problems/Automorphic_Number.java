import java.util.Scanner;

public class Automorphic_Number {


    public static void main(String[] args) {
        int number;
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        System.out.println("Enter Number");
        number=sc.nextInt();
        int power=number*number;

        while (number>0){

            if (!(number%10==power%10)){
                flag=false;
                break;
            }
            number=number/10;
            power=power/10;
        }

        if(flag){
            System.out.println("Automorphic");
        }else {
            System.out.println("Not Automorphic");
        }


    }
}
