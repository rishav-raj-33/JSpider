package String;

//String permutation
//write a java program to print string permutation
//input: abc
//output: abc acb bac bca cba cab


//Assigment do it by loop

public class Q38 {


    public static void main(String[] args) {
        String a="abc";






    }


    public static void permutation(String a,int i,int  j){

        if (i==j){
            System.out.println(a);
            return;
        }

        for (int k = 0; k < j; k++) {
            String s1=swap(a,i,j);
            permutation(s1,i+1,j);
        }
    }


    public static String swap(String s,int i,int j){
        char[] ch=s.toCharArray();
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
        return new String(ch);
    }




}
