import java.util.Scanner;

public class FactorsOfNumberWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Factors of " + number + " are:");
        int i = 1;
        while (i <= number) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
            i++;
        }

        scanner.close();
    }
}
