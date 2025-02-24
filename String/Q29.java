package String;


//biggest sub string palindrome in a given string

public class Q29 {

    public static void main(String[] args) {

        String a="malayalam";
        String maxSubstring="";

        for (int i = 0; i <a.length() ; i++) {
            for (int j = i+3; j <a.length(); j++) {
                String result=a.substring(i,j);
                if (isPalindrome(result)){
                    if (maxSubstring.length()<result.length()){
                        maxSubstring=result;
                    }
                }
            }
        }

        System.out.println(maxSubstring);
    }


    public static boolean isPalindrome(String a) {
        int j = a.length() - 1;
        int i = 0;
        while (i <j) {

            if (a.charAt(i) != a.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
