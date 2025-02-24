package String;
/*
*   String buffer vs string builder
* ---------------------------------------
* ->String buffer is a mutable version of string class. |    ->String builder is a mutable version of string class.
* ->String buffer methods are thread safe.              |   ->String builder methods are not a thread safe.
* ->String buffer methods are Synchronized              |    ->String builder methods are not a Synchronized
 *
*
*
*
* */
public class MutableString {


    public static void main(String[] args) {
     StringBuffer s=new StringBuffer("rishav");
        System.out.println(s.capacity());
        System.out.println(s.length());
    }
}
