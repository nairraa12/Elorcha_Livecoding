package elorcha_problem3;

import java.util.Scanner;

public class Elorcha_Problem3 {

    // Method 1: Calculate Array Sum
    public static int arraySum(int[] values, int index) {

        // Base Case
        if (index == values.length) {
            return 0;
        }

        // Recursive Case
        return values[index] + arraySum(values, index + 1);
    }

    // Method 2: Find Maximum Element
    public static int findMaximum(int[] values, int index) {

        // Base Case
        if (index == values.length - 1) {
            return values[index];
        }

        // Recursive Case
        int maximum = findMaximum(values, index + 1);

        if (values[index] > maximum) {
            return values[index];
        } else {
            return maximum;
        }
    }

    // Method 3: Count Even Elements
    public static int countEven(int[] values, int index) {

        // Base Case
        if (index == values.length) {
            return 0;
        }

        // Recursive Case
        if (values[index] % 2 == 0) {
            return 1 + countEven(values, index + 1);
        } else {
            return countEven(values, index + 1);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.useDelimiter("[,\\s]+");

        int[] values = new int[4];

        for (int i = 0; i < values.length; i++) {
            values[i] = input.nextInt();
        }

        // Call recursive methods
        int sum = arraySum(values, 0);
        int maximum = findMaximum(values, 0);
        int evenCount = countEven(values, 0);

        // Display results
        System.out.println(sum + "," + maximum + "," + evenCount);

        input.close();
    }
}