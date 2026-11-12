package problem2;

import java.util.Scanner;

public class Elorcha_Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ignore parentheses, commas, and spaces (keeps '-' for negative validation)
        input.useDelimiter("[^0-9-]+");

        // Read two numbers from input, e.g., (98,89)
        int a = input.nextInt();
        int b = input.nextInt();

        int result = gcd(a, b);

        // Validate Negative inputs
        if (a < 0 || b < 0) {
            System.out.print("Invalid Input.");
            
            
// GCD of two zeros is undefine
        } else if (a == 0 && b == 0) {
            System.out.println("Undefined - handle in main()");

        } else {
            System.out.println(result);

        }
        input.close();
    }

    // use recursive and using the Euclidean algorithm
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);

    }
} 
