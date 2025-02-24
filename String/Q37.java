package String;

//write a java program to remove duplicate element by contains method

public class Q37 {


    public static void main(String[] args) {
        String a="javadev";
        String output="";

        for (int i = 0; i < a.length(); i++) {
            char ch=a.charAt(i);
            if (!output.contains(""+ch)){
                output+=ch;
            }
        }

        System.out.println(output);



    }


}
