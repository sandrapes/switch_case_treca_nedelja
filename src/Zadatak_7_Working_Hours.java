import java.util.Scanner;

public class Zadatak_7_Working_Hours {
    public static void main(String[] args) {
        // Write a program that reads an hour of the day (integer) and a day of the week (string) -
        // entered by the user and checks whether the company's office is open,
        // the office hours are from 10:00(10 am) to 18:00(6 pm), from Monday to Saturday including.

        Scanner sc = new Scanner(System.in);

        int hourOfDay = Integer.parseInt(sc.nextLine());
        String dayOfWeek = sc.nextLine();

        if ((hourOfDay >= 10 && hourOfDay <= 18) && (dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") ||
                dayOfWeek.equals("Wednesday") || dayOfWeek.equals("Thursday") || dayOfWeek.equals("Friday") ||
                dayOfWeek.equals("Saturday"))) {
            System.out.println("open");
        } else {
            System.out.println("closed");
        }

    }
}
