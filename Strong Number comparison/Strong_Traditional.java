package temp;

public class Strong_Traditional {

    public static void main(String[] args) {

        System.out.println(isStrong(145));

    }



    public static int fact(int number){
        if (number==0) return 0;
        int multiply=1;
        for (int i=1;i<=number;i++){
            multiply*=i;
        }
        return multiply;
    }

    public static boolean isStrong(int number){
        int temp=number;
        int sum=0;
        while (temp!=0){
            sum+=fact(temp%10);
            temp/=10;
        }
        if (sum==number) return true;
        return false;
    }

}

//Test Case: 145

//method call :-4 times    //more expensive than the loop but less expensive than the object creation

//Loop iteration:- 13 times   //more expensive than the variable creation

//Variable created:- 9 variable created during execution.   // Cheapest
