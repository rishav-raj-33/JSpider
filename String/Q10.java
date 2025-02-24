package String;



//Remove the duplicate character from thr string
//input:javadev
//output:javde

public class Q10 {


    public static void main(String[] args) {
        String a="java  dev";
        String output="";
        char []b=a.toCharArray();


        for (int i=0;i<b.length;i++){
            if (b[i]=='\u0000'){
                continue;
            }

            for (int j=i+1;j<b.length;j++){
                if (b[i]==b[j]){
                    b[j]='\u0000';

                }
            }
        }
        for (char z:b){
            if(z!='\u0000'){
                output+=z;
            }

        }

        System.out.println(output);

    }
}
