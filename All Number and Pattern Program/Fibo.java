package temp;

public class Fibo {


    public static void main(String[] args) {

        //  fiboRange(10);
        // fiboRecursionRange(0,10);
        //fiboNormal(10);
        //  fiboRecursionRangeUpto(0,10);
        //  decimalRToBinary(4);

//        decimalToNumber(100);
//        numberToOctal(10);
//        octalToNumber(12);

        snakePattern(5);


    }


    public static void fiboNormal(int n) {
        int a = 0;
        int b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }


    }

    public static void fiboRange(int n) {
        int a = 0;
        int b = 1;
        while (a <= n) {
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;


        }


    }


    public static int fiboRecursion(int n) {

        if (n == 0) return n;
        if (n == 1) return n;


        return fiboRecursion(n - 1) + fiboRecursion(n - 2);

    }


    public static void fiboRecursionRange(int start, int end) {
        if (start >= end) return;


        System.out.println(fiboRecursion(start));

        fiboRecursionRange(start + 1, end);

    }


    public static void fiboRecursionRangeUpto(int start, int end) {
        if (start >= end) return;
        int ans = fiboRecursion(start);
        if (ans <= end) {
            System.out.println(ans);
        }


        fiboRecursionRangeUpto(start + 1, end);

    }


    public static int decimalRToBinary(int number) {
        String result = "";
        while (number > 0) {
            result = number % 2 + result;
            number = number / 2;
        }

        return Integer.parseInt(result);
    }


    public static void decimalToNumber(int decimal) {
        if (decimal == 0) return;
        int result = 0;
        int n = 0;
        while (decimal != 0) {
            int temp = decimal % 10;
            result += temp * (int) Math.pow(2, n);
            decimal = decimal / 10;
            n++;

        }
        System.out.println(result);
    }


    public static void numberToOctal(int number) {
        String result = "";
        while (number > 0) {
            result = number % 8 + result;
            number = number / 8;
        }

        System.out.println(result);
    }


    public static void octalToNumber(int number) {

        int result = 0;
        int n = 0;
        while (number > 0) {
            int temp = number % 10;
            result += temp * (int) Math.pow(8, n);
            n++;
            number = number / 10;

        }
        System.out.println(result);
    }


    public static void snakePattern(int size) {
        int number = 1;



        for (int i = 1; i <= size; i++) {
            boolean isEven = i % 2 == 0;


            for (int j = 1; j <= size; j++) {

                if (isEven) {
                    System.out.print(number+" ");
                    number--;
                } else {
                    System.out.print(number+ " ");
                    number++;

                }


            }
            if (isEven) {
            number=number+size+1;
            } else {
                number=number+size-1;
            }
            System.out.println();

        }
    }
}













