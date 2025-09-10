import java.util.Scanner;

public class SumOfNNumbersForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number n: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        int formulaSum = n * (n + 1) / 2;

        System.out.println("Sum using for loop: " + sum);
        System.out.println("Sum using formula: " + formulaSum);

        if (sum == formulaSum) {
            System.out.println("Both computations are correct.");
        } else {
            System.out.println("There is a mismatch in computations.");
        }

        scanner.close();
    }
}
