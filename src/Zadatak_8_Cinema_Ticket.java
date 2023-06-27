import java.util.Scanner;

public class Zadatak_8_Cinema_Ticket {
    public static void main(String[] args) {

        //Write a program that reads the day of the week (string) - entered by the user and prints
        // on the console the price of a movie ticket according to the day of the week:
        //Monday	Tuesday	 Wednesday	Thursday	Friday	Saturday	Sunday
        //  12	      12	    14	       14	      12	   16	      16

        Scanner sc = new Scanner(System.in);

        String dayOfTheWeek = sc.nextLine();

        if (dayOfTheWeek.equals("Monday") || dayOfTheWeek.equals("Tuesday") || dayOfTheWeek.equals("Friday")) {
            System.out.println("12");
        } else if (dayOfTheWeek.equals("Wednesday") || dayOfTheWeek.equals("Thursday")) {
            System.out.println("14");
        } else if (dayOfTheWeek.equals("Saturday") || dayOfTheWeek.equals("Sunday")) {
            System.out.println("16");
        } else {
            System.out.println("Error");
        }
    }
}
