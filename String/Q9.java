package String;

//write a java program to convert case of the letter in a string lower to upper and upper to lower without using String inbuilt function

//input


public class Q9 {

    public static void main(String[] args) {
        String a="RaWaNa";
        char[]b=a.toCharArray();

        for (int i=0;i<b.length;i++){
            char c=b[i];


            if(c>='a'&& c<='z'){
                b[i]=(char)(c-32);
            }
            if(c>='A'&& c<='Z'){
                b[i]=(char)(c+32);
            }

        }
        System.out.println(b);
    }
}
