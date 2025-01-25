import java.util.Scanner;

public class PowerCalculator {
    // Function to calculate x^n
    public static double power(double x, int n) {
        double result = 1;
        for (int i = 0; i < Math.abs(n); i++) {
            result *= x;
        }
        // If n is negative, return 1/result
        return n < 0 ? 1 / result : result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input x and n
        System.out.print("Enter the base (x): ");
        double x = scanner.nextDouble();
        System.out.print("Enter the exponent (n): ");
        int n = scanner.nextInt();

        // Calculate and display the result
        double result = power(x, n);
        System.out.println(x + " raised to the power " + n + " is: " + result);

        scanner.close();
    }
}


