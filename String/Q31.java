package String;


//Swap String variables without using third variable

public class Q31 {


    public static void main(String[] args) {
        String a="ram";
        String b="sita";

        a=a+b;
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());


        System.out.println(a);
        System.out.println(b);



    }
}
