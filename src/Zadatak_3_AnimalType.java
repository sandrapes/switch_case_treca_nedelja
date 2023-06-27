import java.util.Scanner;

public class Zadatak_3_AnimalType {
    public static void main(String[] args) {

        // Write a program that prints the species of the animal according to its name entered by the user.
        //	dog -> mammal
        //	crocodile, tortoise, snake -> reptile
        //	others -> unknown

        Scanner sc = new Scanner(System.in);

        String animal = sc.nextLine();

        switch (animal) {

            case "dog":
                System.out.println("mammal");
                break;
            case "crocodile":
            case "tortoise":
            case "snake":
                System.out.println("reptile");
                break;
            default:
                System.out.println("unknown");

        }
    }
}
