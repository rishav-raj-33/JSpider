package String;


//write a java program to write missing numbers in a given string
//condition-0 to 9
//input:a5bcd3e1
//output:0,2,4,6,7,,8,9

public class Q45 {


    public static void main(String[] args) {
        String input="a5bcd3e1";
        String result="";
        char [] c=input.toCharArray();
        char[] d={'0','1','2','3','4','5','6','7','8','9'};

        for (int i=0;i<c.length;i++){
            if (Character.isDigit(c[i])){
                for (int j = 0; j < d.length; j++) {
                    if (c[i]==d[j]){
                        d[j]='\u0000';
                    }
                }
            }
        }

        for (char i:d){
            if (i=='\u0000'){
                continue;
            }

             if (result.length()==0) {
                 result+=i;
                 continue;

             }
            result+=","+i;
        }


        System.out.println(result);













    }
}
