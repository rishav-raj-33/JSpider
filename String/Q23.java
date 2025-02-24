package String;

public class Q23 {


    public static void main(String[] args) {
        String a="Education";
        String temp=a.toLowerCase();
        int count=0;
        for (int i = 0; i < a.length(); i++) {
            if (temp.charAt(i)=='a'||temp.charAt(i)=='e'||temp.charAt(i)=='i'||temp.charAt(i)=='o'||temp.charAt(i)=='u'){
                count++;
            }
        }

        if (count>3){
            char[] c=a.toCharArray();
            for (int i = 0; i < c.length; i++) {
                if (c[i]=='A'||c[i]=='a'||c[i]=='e'||c[i]=='E'||c[i]=='i'||c[i]=='I'||c[i]=='o'||c[i]=='O'||c[i]=='u'||c[i]=='U'){
                 c[i]='_';
                }
            }
            System.out.println(new String(c));
        }
    }
}
