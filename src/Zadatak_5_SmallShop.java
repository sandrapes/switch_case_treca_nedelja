import java.util.Scanner;

public class Zadatak_5_SmallShop {

    public static void main(String[] args) {

        //An enterprising person opens neighborhood shops in several cities and sells at different prices:

        //city /    coffee	  water	  beer	  sweets  peanuts
        //London	  0.50	   0.80	  1.20	  1.45	   1.60
        //Rome	     0.40	   0.70	  1.15	  1.30	   1.50
        //Paris	     0.45	   0.70	  1.10	  1.35	    1.55

        //Write a program that reads product (string), city (string), and quantity (a floating-point number)
        // entered by the user and calculates and prints how much the corresponding quantity of the
        // selected product costs in the specified city.

        Scanner sc = new Scanner(System.in);

        String product = sc.nextLine();
        String city = sc.nextLine();
        double quantity = Double.parseDouble(sc.nextLine());

        double productPrice = 1;

        if (city.equals("London")) {
            switch (product) {
                case "coffee":
                    productPrice = 0.50;
                    break;
                case "water":
                    productPrice = 0.80;
                    break;
                case "beer":
                    productPrice = 1.20;
                    break;
                case "sweets":
                    productPrice = 1.45;
                    break;
                case "peanuts":
                    productPrice = 1.60;
                    break;
                default:
                    System.out.println("Error");

            }
        } else if (city.equals("Rome")) {
            switch (product) {
                case "coffee":
                    productPrice = 0.40;
                    break;
                case "water":
                    productPrice = 0.70;
                    break;
                case "beer":
                    productPrice = 1.15;
                    break;
                case "sweets":
                    productPrice = 1.30;
                    break;
                case "peanuts":
                    productPrice = 1.50;
                    break;
                default:
                    System.out.println("Error");

            }
        } else if (city.equals("Paris")) {
            switch (product) {
                case "coffee":
                    productPrice = 0.45;
                    break;
                case "water":
                    productPrice = 0.70;
                    break;
                case "beer":
                    productPrice = 1.10;
                    break;
                case "sweets":
                    productPrice = 1.35;
                    break;
                case "peanuts":
                    productPrice = 1.55;
                    break;
                default:
                    System.out.println("Error");
            }
        }


        double total = productPrice * quantity;
        System.out.println(total);

    }
}


