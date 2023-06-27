import java.util.Scanner;

public class Zadatak_1_Weekdays {

    public static void main(String[] args) {

        //Write a program that reads an integer entered by the user and prints a day of the week within [1 ... 7]
        // or prints "Error" if the number entered is invalid.

        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());

        switch (number)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Error");

        }







    }
}
