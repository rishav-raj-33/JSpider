public class Spy_Number {


    public static void main(String[] args) {

        System.out.println("Loop method result");
        System.out.println(loopSpyNumber(1412));
        System.out.println("----------------------------");
        System.out.println("Simple Range method by Loop Result");
        range(1000,1500);
        System.out.println("----------------------------");
        System.out.println("Recursion method result");
        System.out.println(recursionSpyNumber(1412,0,1));
        System.out.println("Recursion Range method result");
        recursionRange(1000,1500);
        System.out.println("----------------------------");
        System.out.println("Recursion Reverse Range method result");
        reverseRange(1000,1500);
        System.out.println("----------------------------");
        System.out.println("Alternative Spy Number method result");
        alternativeSpyNumberRange(1000,1500,0);
        System.out.println("----------------------------");
        System.out.println("Highest Spy Number in a range");
        highestSpyNumberRange(1000,1500);
        System.out.println("----------------------------");
        System.out.println("Second Highest Spy Number in a range");
        secondHighestSpyNumber(1000,1500,0);
        System.out.println("----------------------------");
        System.out.println("Smallest Spy Number in a range");
        smallestSpyNumberRange(1000,1500);
        System.out.println("----------------------------");
        System.out.println("Second Smallest Spy Number in a range");
        secondSmallestSpyNumber(1000,1500,0);
    }


    public static boolean loopSpyNumber(int number){


        int sum=0;
        int product=1;

        while (number>0){
            int r=number%10;
            sum+=r;
            product*=r;
            number=number/10;
        }
        return sum==product;
    }


    public static void range(int start,int end){
        for(int i=start;i<=end;i++){
            if(loopSpyNumber(i)){
                System.out.println(i+" ");
            }
        }
    }



    public static boolean recursionSpyNumber(int number,int sum,int product){
        if (number==0) return sum==product;

        sum+=number%10;
        product*=number%10;

     return recursionSpyNumber(number/10,sum,product);

    }


    public static void recursionRange(int start,int end){
        if(start>end) return;

        if(recursionSpyNumber(start,0,1)){
            System.out.println(start);
        }

      recursionRange(start+1,end);

    }



    public static void reverseRange(int start,int end){
        if(start>end) return;

        if(recursionSpyNumber(end,0,1)){
            System.out.println(end);
        }
        reverseRange(start,end-1);
    }


    public static void alternativeSpyNumberRange(int start,int end,int count){
        if(start>end) return;
        if(loopSpyNumber(start)){
            count++;
            if(count%2!=0){
                System.out.println(start+" ");
            }
        }

        alternativeSpyNumberRange(start+1,end,count);
    }


    public static void highestSpyNumberRange(int start,int end){
        if(start>end) return;
    if(loopSpyNumber(end)){
        System.out.println(end);
        return;
    }
        highestSpyNumberRange(start,end-1);
    }

    public static void secondHighestSpyNumber(int start,int end,int count){
        if(start>end) return;

        if(loopSpyNumber(end)) {
            count++;
            if (count == 2) {
                System.out.println(end);
                return;
            }
        }
            secondHighestSpyNumber(start,end-1,count);
        }


    public static void smallestSpyNumberRange(int start,int end){
        if(start>end) return;
        if(loopSpyNumber(start)){
            System.out.println(start);
            return;
        }
        smallestSpyNumberRange(start+1,end);
    }


    public static void secondSmallestSpyNumber(int start,int end,int count){
        if(start>end) return;

        if(loopSpyNumber(start)) {
            count++;
            if (count == 2) {
                System.out.println(start);
                return;
            }
        }
        secondSmallestSpyNumber(start+1,end,count);
    }






}
