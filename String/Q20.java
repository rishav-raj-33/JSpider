package String;

public class Q20 {

    public static void main(String[] args) {
        String a="Hello World";
        boolean flag=false;

        char[]b=a.toCharArray();
        for (int i = 0; i < b.length; i++) {
            int c='1';

            for (int j = i+1; j < b.length; j++) {

                if (b[i]==b[j]){
                    flag=true;
                    b[j]=(char) (++c);
                }
            }

            if (flag) {
                b[i]='1';
                flag=false;
            }

        }


        System.out.println(new String(b));
    }
}
