package String;
//Write a java program to print second maximum character in a string


public class Q33 {


    public static void main(String[] args) {


        String a="javadev";
        int max=0;
        char c1=' ';
        int max1=0;
        int c2=' ';


        while (a.length()!=0){
            char c=a.charAt(0);
            String output=a.replace(c+"","");
            int count=a.length()-output.length();

            if(count>max){
                max1=max;
                c1=c;
                max=count;
            } else if (count>max1 && count!=max) {
                c2=c;
                max1=count;
            }
            a=output;
        }
    }
}
