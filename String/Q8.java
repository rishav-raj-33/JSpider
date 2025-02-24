package String;

//write a program to reverse the sentence.


public class Q8 {
    public static void main(String[] args) {
        String a = "java is easy";
        String res = "";
        String output = "";

        for (int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            if (ch==' ' && i!=a.length()-1) {
                 output=ch+res+output;
                res="";
                continue;
            }
            if(i==a.length()-1){
                output=res+ch+output;
            }
            res+=ch;
        }
        System.out.println(output);
    }
}
