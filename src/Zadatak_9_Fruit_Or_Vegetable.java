import java.util.Scanner;

public class Zadatak_9_Fruit_Or_Vegetable {

    public static void main(String[] args) {

        //Write a program that reads a product name entered by the user and checks if it is a fruit or vegetable.
        //•	The fruits are banana, apple, kiwi, cherry, lemon, and grapes
        //•	The vegetables "vegetable" are tomato, cucumber, pepper, and carrot
        //•	Everything else is "unknown"
        //Print "fruit", "vegetable" or "unknown" depending on the introduced product.

        Scanner sc = new Scanner(System.in);

        String product = sc.nextLine();

        switch (product) {
            case "banana":
            case "apple":
            case "kiwi":
            case "cherry":
            case "lemon":
            case "grapes":
                System.out.println("fruit");
                break;
            case "tomato":
            case "cucumber":
            case "pepper":
            case "carrot":
                System.out.println("vegetable");
                break;
            default:
                System.out.println("unknown");
        }


    }
}
