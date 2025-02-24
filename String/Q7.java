package String;

//write a program to reverse the words in a sentence

//input: "java is easy"
//output: avaj si ysae

public class Q7 {


    public static void main(String[] args) {
        String a="java is";
        String res="";
        String output="";
        int j=0;




        for (int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            if (ch==' ' && i!=a.length()-1) {
                j++;
                if (j==1) output+=res;
              else output+=ch+res;
                res="";
                continue;
            }

            if(i==a.length()-1){
                output+=" "+ch+res;
            }

            res=ch+res;
        }
        System.out.println(output);
        System.out.println(rev(a));



    }


    public static  String rev(String a){
        int i=0,j=0;

        String res="";

        while (j<a.length()){
            while (j<a.length() && a.charAt(j)!=' ')
                j++;
            int k=j-1;
            while (k>=i){
                res+=a.charAt(k);
                k--;
            }
            if(j<a.length()){
                res+=" ";
            }
            j++;
            i=j;


        }
        return res;
    }
}
