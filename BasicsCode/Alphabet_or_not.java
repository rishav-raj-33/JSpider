package BasicsCode;

import java.util.Scanner;

public class Alphabet_or_not {

    public static void main(String[] args) {
        char a;
        Scanner c=new Scanner(System.in);

        System.out.println("Enter the character");
        a=c.next().charAt(0);

        if ((a>='A' && a<='Z') ||(a>='a'&& a<='z')){
            System.out.println("Alphabet");
        }else {
            System.out.println("Non-alphabet");
        }

    }
}
