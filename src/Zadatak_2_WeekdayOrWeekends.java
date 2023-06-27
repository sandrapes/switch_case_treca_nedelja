import java.util.Scanner;

public class Zadatak_2_WeekdayOrWeekends {
    public static void main(String[] args) {

        //Write a program that reads the day of the week (string) - entered by the user.
        // If the day is a working day, it prints on the console - "Working day", if it is a day off - "Weekend".
        // If any text other than the day of the week is entered, print "Error".

        Scanner sc = new Scanner(System.in);

        String day = sc.nextLine();

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Working day");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Error");
        }


    }
}
