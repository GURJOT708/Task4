import java.util.Scanner;

public class PowerCalculatorWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        double result = 1;
        int i = 1;

        while (i <= exponent) {
            result *= base;
            i++;
        }

        System.out.println(base + " raised to the power " + exponent + " is: " + result);
        scanner.close();
    }
}
