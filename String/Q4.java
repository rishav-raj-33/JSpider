package String;

public class Q4 {
    public static void main(String[] args) {
  String a="JavaDev123@#";
  String uc="",lc="",sp="",nc="";


  for (int i=0;i<a.length();i++){
    char ch=a.charAt(i);
    if (ch>='A' && ch<='Z') uc+=ch;
    else if(ch>='a' && ch<='z') lc+=ch;
   else if (ch>='0' && ch<='9') nc+=ch;
    else sp+=ch;

  }
      System.out.println(lc+uc+nc+sp);
    }
}
