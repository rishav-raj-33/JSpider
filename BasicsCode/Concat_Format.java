import java.util.Scanner;

public class Concat_Format {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter Number");
        int a=sc.nextInt();
        String s="";
        for(int i=1;i<=a;i++){
            s+=i;
            sum+=i;
            if(i==a){
                break;
            }
            s+="+";


        }

       s+=("="+sum);
        System.out.println(s);



    }
}
