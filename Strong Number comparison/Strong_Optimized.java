package temp;

public class Strong_Optimized {


    public static void main(String[] args) {

       int[] fact=factorial();
       int number=145;
       int temp=number;
       int sum=0;
        while (number>0){
            sum+=fact[number%10];
            number/=10;
        }
        System.out.println(temp==sum);




    }





    public static int[] factorial(){


        int[] fact = new int[10];
        fact[0]=0;
        fact[1]=1;
        for (int i=2;i<=9;i++){
            fact[i]=fact[i-1]*i;
        }

        return fact;
    }

}


//Test Case: 145

//Variable:-14  cheapest
//Loop iteration:- 11 more expensive
//method call:- 1  more expensive than the loop but less expensive than the object creation.
