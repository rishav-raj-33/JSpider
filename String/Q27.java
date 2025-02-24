package String;



//printing all possible sub string
public class Q27 {

    public static void main(String[] args) {
        String a="malayalam";


        for (int i = 0; i <a.length() ; i++) {
            for (int j = i+3; j <=a.length(); j++) {
                System.out.println(a.substring(i,j));
            }
        }
    }
}
