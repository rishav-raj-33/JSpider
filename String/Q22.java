package String;

public class Q22 {

    public static void main(String[] args) {
        String a="aabccadd";
        char[]c=a.toCharArray();
        char result=' ';

        count(a);


    }


    public static String count(String a){
        int count=0;
        char[] z=a.toCharArray();
        int i=0;
        while (a.charAt(i)==a.charAt(i+1) && i+1!=a.length()){
            count++;
            i++;
        }
        System.out.println(a.charAt(i)+String.valueOf(i));

        return null;
    }


    }

