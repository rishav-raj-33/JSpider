package String;
//swap the character based on index value
//input:abcde 2
//output:adcbe

public class Q44 {


    public static void main(String[] args) {


        String a="abcde";
        System.out.println(swap(a,2));

    }





    public static String swap(String a,int i){
        if (a.length()<i+i){
            return "String length is not enough";
        }
        char[] result=a.toCharArray();
        char temp=result[i-1];
        int index=a.length()-i;
        result[i-1]=result[index];
        result[index]=temp;
        return new String(result);
    }
}
