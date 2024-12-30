import java.util.Scanner;

public class Number_Of_Days {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        System.out.println("Enter month year");
        int m=sc.nextInt();
        int y=sc.nextInt();

        switch (m){
            case 1:
            case 3:
            case 7:
            case 8:
            case 10:
            case 12:
            case 5:

                System.out.println("31 Days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30days");
            case 2:
                if((y%400==0)||(y%4==0&&(y%100!=0))){
                    System.out.println("29 Days");
                } else {
                    System.out.println("28 Days");
                }
                break;
            default:
                System.out.println("Invalid Input");



        }


    }





}
