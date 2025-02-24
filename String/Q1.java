package String;

//write a java program to check Vowel count in a given string.

//input:javadev
//output:3


public class Q1 {

    public static void main(String[] args) {
        String a="javadev";
        int count=0;

        for (int i=0;i<a.length();i++){
            if(a.charAt(i)=='a'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='e'||a.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println(count);

    }
}
