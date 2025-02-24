package String;

public class Q21 {

    public static void main(String[] args) {
        String a="2a3b1c";
       // String a="aa2b3cdd";
        String result=" ";
        char[]c=a.toCharArray();



        for (int i=0;i<c.length;i++){
            int number=0;

                if (c[i]>='0' && c[i]<='9' ){
                    if (!(c[i+1]>='0' && c[i+1]<='9')){
                        number=c[i]-'0';
                       result=loop(number,c[i+1],result);
                    }
                    } else {
                    result+=c[i];
                }
                }

        System.out.println(result);
            }



    public static String loop(int number,char c,String result){
        for (int i = 1; i <number ; i++) {
            result+=c;
        }
        return result;
    }


    public static void cleanUp(String a){
        int number=0;
        char[] op=a.toCharArray();


    }
}



