package String;

//write the java program to check vowel count in a string.
//input:"JavaDev@12#@*"
//output:vc=2,lc=5,nc=2,sp=4


public class Q2 {
    public static void main(String[] args) {
        String a="JavaDev@12#@*";
        int lc=0,uc=0,nc=0;
        int specialChar=0;


        for (int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            if (ch>='A' && ch<='Z') uc++;
            if(ch>='a' && ch<='z') lc++;
            if (ch>='0' && ch<='9') nc++;


        }

     int sp=a.length()-(lc+uc+nc);
        System.out.println(lc+" "+uc+" "+nc+" "+sp);



        check(a);
    }



    public static void check(String a){
        int count=0;
        for (int i=0;i<a.length();i++){
            char ch=a.charAt(i);

            if((ch>='A' && ch<='Z') || ch>='a' && ch<='z'){
                count++;
            }

        }
        System.out.println(count);
    }

}
