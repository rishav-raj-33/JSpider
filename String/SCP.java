package String;

public class SCP {


/*String->String is a collection of characters enclosed within double quotes.String is non-primitive type
 String class present in java.lang package
 String is a final class
 we can create string in two ways: by using string literals and second by using new keyword.
 SCP (String constant pool)->scp is a part of heap area
 SCP will store only string objects
 memory will be allocated inside scp when string is created by double quotes
 scp will not allow to store duplicate string objects.


 Q what is string immutability?
 A. String having immutable nature once string is created we can't modify the string if we try to modify the string every time a new string object will create
 this is called string immutability.

Q. why string made as immutable?
A. one string object can referred by multiple program if anyone program string it will affect other programs too.
To prevent this situation string made as immutable.





    */



    public static void main(String[] args) {
        String s1="java";
        String s2="java";
        String s3=new String("java");

        System.out.println(s1==s3);
        System.out.println(s1==s2);
        System.out.println(s1.equals(s3));
        System.out.println(s1.hashCode());
        //----------------------------------------------------------

        String a1="javadev";
        String a2="java";
        String a3="dev";
        String a4=a2+a3;  //heap
        String a5="java"+"dev"; //scp
        System.out.println(a1==a5); //true
        System.out.println(a5==a4); //false

    }
}
