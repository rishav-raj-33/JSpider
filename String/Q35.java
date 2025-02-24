package String;

//Replace All method

public class Q35 {


    public static void main(String[] args) {

        String a="Ra1ma2na3";

        System.out.println(a.replaceAll("[0-9]",""));
        System.out.println(a.replaceAll("[0-9A-Z]",""));

    }
}
