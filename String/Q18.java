package String;

public class Q18 {


    public static void main(String[] args) {
        char c=' ';
        char c2=' ';
        String a="jaaaaavva";
        int max=0;
        int secondMax=0;
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
                c2=c;
                c=a.charAt(i);
                secondMax=max;
                max=count;
            }
        }

        System.out.println(c2+":"+secondMax);


    }
}
