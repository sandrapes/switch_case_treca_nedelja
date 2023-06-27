import java.util.Scanner;

public class Zadatak_10_Invalid_Number {

    public static void main(String[] args) {

        //A number is valid if it is in the range [100… 200] or is 0. Write a program that reads an
        // integer entered by the user and print "invalid" if the number entered is not valid.

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if ((num >= 100 && num <= 200) || num == 0) {

        } else {
            System.out.println("invalid");
        }
    }
}
