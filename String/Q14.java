package String;

//write a java program for initCap in a string.
//input:"ramana kumar "
//output:Ramana Kumar

public class Q14 {
    public static void main(String[] args) {
        String a="ramana kumar ";
        char[] b=a.toCharArray();

        for (int i=0;i<b.length;i++){

            if (i==0|| b[i-1]==' '){
                if (b[i]>='a' && b[i]<='z') b[i]-=32;
            }
        }

        String output=new String(b);
        System.out.println(output);

    }
}
