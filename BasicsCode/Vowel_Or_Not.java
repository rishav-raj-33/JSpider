package BasicsCode;

import java.util.Scanner;

public class Vowel_Or_Not {


    public static void main(String[] args) {
        char a;
        Scanner c=new Scanner(System.in);

        System.out.println("Enter the character");
        a=c.next().charAt(0);

        if(a=='A'||a=='a'||a=='E'||a=='e'||a=='I'||a=='i'||a=='O'||a=='o'||a=='U'||a=='u'){
            System.out.println("vowel");
        }else {
            System.out.println("consonant");
        }



    }
}
