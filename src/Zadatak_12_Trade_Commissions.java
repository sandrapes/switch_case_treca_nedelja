import java.util.Scanner;

public class Zadatak_12_Trade_Commissions {

    public static void main(String[] args) {

        //The company gives the following commissions to its merchants
        // according to the city in which they operate and the volume of sales:

        //City	0 ≤ s ≤ 500	500 < s ≤ 1 000	1 000 < s ≤ 10 000	s > 10 000
        //London	5%	          7%	            8%	        12%
        //Paris	    4.5%	      7.5%	            10%	        13%
        //Rome	    5.5%	       8%	             12%	    14.5%

        //Write a console program that reads the city name (string) and sales volume (a floating-point number)
        // entered by the user and calculates the percentage of the trade commission according to the table above.
        // Display the result formatted to 2 digits after the decimal point.
        // In case of invalid city or sales volume (negative number) print "error".

        Scanner sc = new Scanner(System.in);

        String city = sc.nextLine();
        double salesVolume = sc.nextDouble();

        double procenat = 1.0;

        switch (city) {
            case "London":
                if (0 <= salesVolume && salesVolume <= 500) {
                    procenat = 5;
                }
                else if ( 500 < salesVolume && salesVolume<= 1000){
                    procenat = 7;

            } else if (1000 < salesVolume && salesVolume<= 10000) {
                    procenat = 8;
                } else if (salesVolume > 10000) {
                    procenat = 12;
                } else {
                System.out.println("error");
                return;}
            break;



            case "Paris":
                if (0 <= salesVolume && salesVolume <= 500) {
                    procenat = 4.5;
                }
                else if ( 500 < salesVolume && salesVolume<= 1000){
                    procenat = 7.5;

                } else if (1000 < salesVolume && salesVolume<= 10000) {
                    procenat = 10;
                } else if (salesVolume > 10000) {
                    procenat = 13;
                } else {
                    System.out.println("error");
                return; }
                break;



            case "Rome":
                if (0 <= salesVolume && salesVolume <= 500) {
                    procenat = 5.5;
                }
                else if ( 500 < salesVolume && salesVolume<= 1000){
                    procenat = 8;

                } else if (1000 < salesVolume && salesVolume<= 10000) {
                    procenat = 12;
                } else if (salesVolume > 10000) {
                    procenat = 14.5;
                } else {
                    System.out.println("error");
                    return;}
                break;
            default:
                System.out.println("error");
                return;

        }

        double commission = salesVolume * procenat /100;
        System.out.printf("%.2f", commission);





    }
}
