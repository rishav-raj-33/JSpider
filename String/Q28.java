package String;

// Print the sub string which is a palindrome string
public class Q28 {

    public static void main(String[] args) {
        String a="malayalam";

        for (int i = 0; i <a.length() ; i++) {
            for (int j = i+3; j <=a.length(); j++) {
                String result=a.substring(i,j);
                if (isPalindrome(result)){
                    System.out.println(result);
                }
            }
        }
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
