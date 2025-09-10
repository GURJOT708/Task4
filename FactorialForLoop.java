import java.util.Scanner;

public class FactorialForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial of " + n + " is: " + factorial);
        scanner.close();
    }
}
