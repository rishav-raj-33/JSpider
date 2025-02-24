package String;

import java.util.Scanner;

//write a program


public class Q5 {

//*
    public static void main(String[] args) {

        String a=new Scanner(System.in).next();
        int sum=0;

        for (int i=0;i<a.length();i++){
            char ch=a.charAt(i);

            if(ch>='0' && ch<='9'){
                sum+=ch-'0';
            }
        }

        System.out.println(sum);

    }
}
