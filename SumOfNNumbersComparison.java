import java.util.Scanner;

public class SumOfNNumbersComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number n: ");
        int n = scanner.nextInt();

        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }

        int formulaSum = n * (n + 1) / 2;

        System.out.println("Sum using while loop: " + sum);
        System.out.println("Sum using formula: " + formulaSum);

        if (sum == formulaSum) {
            System.out.println("Both computations are correct.");
        } else {
            System.out.println("There is a mismatch in computations.");
        }

        scanner.close();
    }
}
