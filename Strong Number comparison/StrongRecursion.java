package temp;

public class StrongRecursion {

    public static void main(String[] args) {
        System.out.println(isStrong(145,145,0));
    }

    public static boolean isStrong(int number,int temp,int sum){
        if(temp==0) return number==sum;
        sum+=fact(temp%10);
        return isStrong(number,temp/10,sum);
    }


    public static int fact(int number){
        if(number==1) return 1;

        return number * fact(number-1);
    }

}


//Test Case: 145

//Variable:-22  cheapest
//Loop iteration:- 0 more expensive
//method call:- 14  more expensive than the loop but less expensive than the object creation.
