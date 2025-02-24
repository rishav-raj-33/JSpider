package String;

public class Q17 {

    public static void main(String[] args) {


        char c=' ';
        String a="jaaaaavva";
        int min=a.length();
        char[] b=a.toCharArray();
        for (int i=0;i<b.length;i++){
            if (b[i]==' ') continue;
            int count=1;
            for (int j=i+1;j<b.length;j++){
                if (b[i]==b[j]){
                    count++;
                    b[j]='\u0000';
                }

            }
            if (min>count){
                c=b[i];
                min=count;
            }
        }


        System.out.println(c+"="+min);


    }

    }

