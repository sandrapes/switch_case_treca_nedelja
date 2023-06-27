import java.util.Scanner;

public class Zadatak_4PersonalTitles {
    public static void main(String[] args) {

        //Write a console program that reads the age (a floating-point number) and gender ("m" or "f") entered
        // by the user and prints an address from the following:
        //•	"Mr." - a man (gender "m") of 16 years or more
        //•	"Master" - a boy (gender "m") under 16 years old
        //•	"Ms." – a woman (gender "f") of 16 years or more
        //•	"Miss" – a girl (gender "f") under 16 years old

        Scanner sc = new Scanner(System.in);

        double age = Double.parseDouble(sc.nextLine());
        String gender = sc.nextLine();

        if (gender.equals("f")) {
            if (age < 16) {
                System.out.println("Miss");
            } else {
                System.out.println("Ms.");
            }

        } else if (gender.equals("m")) {
            if (age < 16) {
                System.out.println("Master");
            } else {
                System.out.println("Mr.");
            }

        }
    }
}







