package String;

//Palindrome String or not

//input:madam
//output:true


import java.util.Scanner;
//**
public class Q6 {

    public static void main(String[] args) {
        String a=new Scanner(System.in).next();

        System.out.println(a+" is Palindrome:"+isPalindrome(a));
    }



   static boolean isPalindrome(String a){
        int i=0;
        int j=a.length()-1;
        while (!(i==j)){
            if (a.charAt(i)!=a.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
