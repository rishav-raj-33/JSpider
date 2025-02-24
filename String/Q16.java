package String;
//write a java pro
public class Q16 {
    public static void main(String[] args) {

         int max=0;
         char c=' ';
        String a="jaaaaavva";
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
            if (max<count){
                c=a.charAt(i);
                max=count;
            }
        }


        System.out.println(c+"="+max);


    }



}
