package String;

//write a java program to print unique character ina string

//input:Ramana kumar
//output:rn Kur

//input:java
//output:jv


public class Q11 {

    public static void main(String[] args) {
       // String a="Ramana Kumar";
        String a="java";

        String output="";
        boolean flag=false;
        char []b=a.toCharArray();

        for (int i=0;i<b.length;i++){
            if (b[i]=='\u0000'){
                continue;
            }

            for (int j=i+1;j<b.length;j++){
                if (b[i]==b[j]){
                    flag=true;
                    b[j]='\u0000';
                }
            }
            if (flag) {
                b[i]='\u0000';
                flag=false;
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
