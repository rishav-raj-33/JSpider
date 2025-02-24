package String;


//Write a java program to check if a string is panagrarm or not

//input:A QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
//output: true
public class Q40 {

    public static void main(String[] args) {
        String input="A QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        System.out.println(isPanagram(input.toLowerCase(),'a'));



    }


    public static boolean isPanagram(String a,char c){
        if (c>'z') return true;
        if (a.length()<26) return false;
        if (!a.contains(c+"")) return false;
        return isPanagram(a, (char)(c+1));
    }


}
