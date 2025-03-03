import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();
        
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();
        scanner.close();

        double result = power(base, exponent);
        
        System.out.println(base + " raised to the power of " + exponent + " is " + result);
    }

    public static double power(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent > 0) {
            return base * power(base, exponent - 1);
        } else {
            return 1 / power(base, -exponent);
        }
    }
}