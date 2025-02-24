package String;


//Anagram String
public class Q34 {

    public static void main(String[] args) {
        String a="race";
        String a1="care";

        if (a.length()!=a1.length()) System.out.println(false);
        while (a.length()!=0){
            char c=a.charAt(0);
            a=a.replace(c+"","");
            a1=a1.replace(c+"","");
            if (a.length()!=a1.length()) {
                System.out.println(false);
                return;
            }

        }
        System.out.println(true);

        String c="race";
        String c1="care";

        System.out.println(anagram(c,c1));
            }






            public static boolean anagram(String a,String b){
            if (a.length()!=b.length()) return false;
            if (a.length()!=0) return  true;
            char c=a.charAt(0);
                a=a.replace(c+"","");
                b=b.replace(c+"","");
            return anagram(a,b);
            }




        }




