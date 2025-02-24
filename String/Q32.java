package String;

//By using replace print every frequency of the all character in given string
public class Q32 {

    public static void main(String[] args) {
        String a="javadev";


        while (a.length()!=0){
            char c=a.charAt(0);
            String output=a.replace(c+"","");
            System.out.println(c+"="+(a.length()-output.length()));
            a=output;
        }







    }
}
