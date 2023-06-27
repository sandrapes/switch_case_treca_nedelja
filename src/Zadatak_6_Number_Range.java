import java.util.Scanner;

public class Zadatak_6_Number_Range {

    public static void main(String[] args) {

        // da li je broj u rangu od -100 do 100 i da li nije 0
        // ispisati yes ako jeste, i da broj nije 0
        // ispisati no ako nije

        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());

        if (number >= -100 && number <= 100 && number != 0) {

            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


    }
}
