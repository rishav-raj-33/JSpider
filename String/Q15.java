package String;
//write a java program to calculate every character frequency in a string
public class Q15 {

    public static void main(String[] args) {
        String a="Ramana kumar";
        char[] b=a.toCharArray();
        for (int i=0;i<b.length;i++){
            if (b[i]==' ') continue;
            int count=1;
            for (int j=i+1;j<b.length;j++){
                if (b[i]==b[j]){
                    count++;
                    b[j]='\u0000';
                }
                System.out.println(b[i]+":"+count);
            }
        }
    }
}
