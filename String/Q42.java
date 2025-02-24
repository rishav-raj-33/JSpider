package String;


//Encoding and decoding
//write a java program for string encryption and decryption.

//Encode-->input-->abc,2
//output--->cde

//decode--->xyz,-2
//output--->vwx

public class Q42 {


    public static void main(String[] args) {
        String input="abc";

    }


    public static String encode(String a,int b,String result){
        if (a.length()==0) return result;

        result+=(char)((a.charAt(0)+b)%26);

       return encode(a.substring(2,a.length()),b,result);
    }



    public static String encode2(String s,int n){
        char [] c=s.toCharArray();
        for (int i=0;i<c.length;i++){
            if (Character.isUpperCase(c[i])){
                c[i]=((char)(((((c[i]-'A'+n)%26)+26)%26)+'A'));
            } else if (Character.isLowerCase(c[i])) {
                c[i]=((char)(((((c[i]-'a'+n)%26)+26)%26)+'a'));
            }
        }
        return new String(c);
    }


}
