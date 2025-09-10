import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a natural number (positive integer).");
        } else {
            int sum = n * (n + 1) / 2;
            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        }

        scanner.close();
    }
}

