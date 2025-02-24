package String;

public class Q25 {

    public static void main(String[] args) {
        String a="Bengaluru is Bengaluru city";
        String [] output=a.split(" ");
        String result=" ";
        for (int i = 0; i < output.length; i++) {
            for (int j = i+1; j < output.length; j++) {
                if (output[i].equals(output[j])){
                    output[j]=" ";
                }
            }
        }

        for (int i = 0; i < output.length; i++) {
            if (output[i]==" ") continue;
            result+=" "+output[i];
        }
        result=result.trim();
        System.out.println(result);
    }
}
