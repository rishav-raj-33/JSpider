import java.util.Scanner;

public class Base_Power {


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int base,power;
        int calculatedPower=1;
        System.out.println("Enter Base");
        base=sc.nextInt();
        System.out.println("Enter Power");
        power=sc.nextInt();

        for (int i=1;i<=power;i++){
            calculatedPower*=base;
        }

        System.out.println(calculatedPower);
    }
}
