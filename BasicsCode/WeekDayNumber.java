import java.util.Scanner;

public class WeekDayNumber {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter vWeek Number");
        int a=sc.nextInt();

        switch (a){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Input");
        }


    }


    public static void anotherSyntax(int a){
        switch (a){
            case 1-> System.out.println("Sunday");

            case 2-> System.out.println("monday");

            case 3-> System.out.println("Tuesday");

            case 4-> System.out.println("Wednesday");

            case 5-> System.out.println("Thursday");

            case 6-> System.out.println("Friday");

            case 7-> System.out.println("Saturday");

            default -> System.out.println("Invalid Input");

        }
    }
}
