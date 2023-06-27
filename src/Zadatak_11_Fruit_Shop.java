import java.util.Scanner;

public class Zadatak_11_Fruit_Shop {

    public static void main(String[] args) {

        //Fruit shop on weekdays works at the following prices:

        //fruit	banana	apple	orange	grapefruit	kiwi	pineapple	grapes
        //price	2.50	1.20	0.85	1.45	    2.70	  5.50	     3.85

        //On Saturdays and Sundays, the store is works at higher prices:
        //fruit	banana	apple	orange	grapefruit	kiwi	pineapple	grapes
        //price	2.70	1.25	0.90	  1.60	    3.00	   5.60	     4.20

        //Write a program that reads from the console fruit
        // (banana / apple / orange / grapefruit / kiwi / pineapple / grapes),
        // day of the week (Monday / Tuesday / Wednesday / Thursday / Friday / Saturday / Sunday),
        // and quantity (a floating-point number), entered from the customer,
        // and calculates the sum according to the prices in the tables above.
        // In case of an invalid day of the week or invalid fruit name, print "error".

        Scanner sc = new Scanner(System.in);

        String fruit = sc.nextLine();
        String dayOfWeek = sc.nextLine();
        double quantity = sc.nextDouble();

        double fruitPrice = 1;

        if (dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Wednesday") ||
                dayOfWeek.equals("Thursday") || dayOfWeek.equals("Friday")) {
            switch (fruit) {
                case "banana":
                    fruitPrice = 2.50;
                    break;
                case "apple":
                    fruitPrice = 1.20;
                    break;
                case "orange":
                    fruitPrice = 0.85;
                    break;
                case "grapefruit":
                    fruitPrice = 1.45;
                    break;
                case "kiwi":
                    fruitPrice = 2.70;
                    break;
                case "pineapple":
                    fruitPrice = 5.50;
                    break;
                case "grapes":
                    fruitPrice = 3.85;
                    break;
                default:
                    System.out.println("error");
                    return;

            }
        } else if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")) {

            switch (fruit) {
                case "banana":
                    fruitPrice = 2.70;
                    break;
                case "apple":
                    fruitPrice = 1.25;
                    break;
                case "orange":
                    fruitPrice = 0.90;
                    break;
                case "grapefruit":
                    fruitPrice = 1.60;
                    break;
                case "kiwi":
                    fruitPrice = 3.00;
                    break;
                case "pineapple":
                    fruitPrice = 5.60;
                    break;
                case "grapes":
                    fruitPrice = 4.20;
                    break;
                default:
                    System.out.println("error");
                    return;

            }
        } else {System.out.println("error");
            return;

        }

        double total = fruitPrice * quantity;

        System.out.printf("%.2f", total);


    }
}
