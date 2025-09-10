import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = Math.abs(scanner.nextInt()); // Handle negative numbers

        int count = 0;

        if (number == 0) {
            count = 1; // Special case for 0
        } else {
            while (number > 0) {
                number /= 10;
                count++;
            }
        }

        System.out.println("Number of digits: " + count);
        scanner.close();
    }
}


