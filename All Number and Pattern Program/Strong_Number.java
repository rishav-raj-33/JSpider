public class Strong_Number {


    public static void main(String[] args) {

        System.out.println("Loop Strong Number");
        System.out.println(isStrong(145));
        System.out.println("---------------------------");
        System.out.println("Recursion Strong Number");
        System.out.println(isStrongRecursion(145,145,0));
        System.out.println("---------------------------");
        System.out.println("Strong Number in a Range");
        rangeRecursion(1,5000);
        System.out.println("-------------------------------");
        System.out.println("Alternative Strong Number");
        alternativeStrongNumber(1,150,0);
        System.out.println("--------------------------------------");
        System.out.println("Reverse Strong Number in a Range");
        reverseStrongNumber(1,150);
        System.out.println("---------------------------------------");
        System.out.println("Highest Strong Number in a Range");
        highestStrongNumber(1,150);
        System.out.println("--------------------------------------------");
        System.out.println("Smallest String Number in a Range");
        smallestStrongNumber(1,150);
        System.out.println("---------------------------------------");

    }


    public static int factorial(int number){
        int product=1;
        for (int i=1;i<=number;i++){
            product*=i;
        }

        return product;
    }

    public static boolean isStrong(int number){
          int temp=number;
          int sum=0;
        while (temp>0){
            sum+=factorial(temp%10);

            temp=temp/10;
        }

        return sum==number;
    }


    public static boolean isStrongRecursion(int number,int temp,int sum){
        if(temp==0) return number==sum;

        sum+=factorial(temp%10);

       return isStrongRecursion(number,temp/10,sum);

    }


    public static void rangeRecursion(int start,int end){
        if (start>end) return;

        if(isStrongRecursion(start,start,0)){
            System.out.println(start);
        }

        rangeRecursion(start+1,end);

    }


    public static void alternativeStrongNumber(int start,int end,int count){
        if (start>end) return;


        if (isStrong(start)){
            count++;
            if(count%2!=0){
                System.out.println(start);
            }
        }


        alternativeStrongNumber(start+1,end,count);
    }


    public static void reverseStrongNumber(int start,int end){
        if (start>end) return;

        if(isStrong(end)){
            System.out.println(end);
        }

        reverseStrongNumber(start,end-1);

    }

    public static void highestStrongNumber(int start,int end){
        if (start>end) return;

        if(isStrong(end)){
            System.out.println(end);
            return;
        }
        highestStrongNumber(start,end-1);


    }


    public static void smallestStrongNumber(int start,int end){
        if (start>end) return;
        if(isStrong(start)){
            System.out.println(start);
            return;
        }
        smallestStrongNumber(start+1,end);
    }




}
