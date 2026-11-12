package main;

import java.util.Scanner;

public class Elorcha_Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int result = sumOfDigits(number);

        // Validate the input
        if (number < 0) {
            System.out.println("Invalid Input.");
        } else {
            System.out.println(result);
        }

    }

    static int sumOfDigits(int number) {

        // Base case: if number is 0, return 0
        if (number == 0) {
            return 0;
        }

        // Recursive case:
        // Get the last digit and add the remaining digits
        return (number % 10) + sumOfDigits(number / 10);
    }

}
