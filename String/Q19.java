package String;

public class Q19 {

    public static void main(String[] args) {


        int max=0;
        int secondMax=0;
        String a="jaaaaavva";
        char[] b=a.toCharArray();


        for (int i=0;i<b.length;i++){

            for (int j=0;j<b.length-1;j++){
                if (b[j]>b[j+1]){
                    char temp=b[j];
                    b[j]=b[j+1];
                    b[j+1]=temp;

                }
            }
        }
        System.out.println(new String(b));
    }
}
