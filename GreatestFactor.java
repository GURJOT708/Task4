import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int greatestFactor = 1; // Initialize with 1 (every number is divisible by 1)

        for (int i = number / 2; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break; // First factor from the top is the greatest
            }
        }

        System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);
        scanner.close();
    }
}
