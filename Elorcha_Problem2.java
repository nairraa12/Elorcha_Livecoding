package problem2;

/**
 *
 * @author ELORCHA_CPE113
 */
import java.util.Scanner;

public class Elorcha_Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        input.useDelimiter("[,\\s]+");

        int a = input.nextInt();
        int b = input.nextInt();

        //Validate Negative inputs
        if (a < 0 || b < 0) {
            System.out.println("Invalid input. ");

            // GCD of two zeros is undefine
        } else if (a == 0 && b == 0) {
            System.out.println("Undefined");
        } else {
            int result = gcd(a, b);

            System.out.println(result);
        }

    }

    public static int gcd(int a, int b) {
        //Base case: when b becomes 0, return to a
        if (b == 0) {
            return a;
        }

        //Recursive case: call the gcd using b and the remainder
        return gcd(b, a % b);
    }

}
