package String;


//write a java program to find the length of the string without length method
public class Q43 {

    public static void main(String[] args) {
        String a="123444";
        int count=0;

      char[] c=a.toCharArray();


        for (char i:c){
            count++;
        }
        System.out.println(count);
    }
}
