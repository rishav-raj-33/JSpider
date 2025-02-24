package String;

public class Q24 {
    public static void main(String[] args) {

        String a="madam sir madam aitea";
        String[] output=a.split(" ");
        for (int i=0;i<output.length;i++){
            if (isPalindrome(output[i])){
                System.out.println(output[i]);
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


    public static void result(){
        String a="Java is easy";
        String [] r=a.split(" ");
        for(int i=0;i<r.length;i++){
            System.out.println(r[i]);
        }
    }
}
