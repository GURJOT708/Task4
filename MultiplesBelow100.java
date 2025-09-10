import java.util.Scanner;

public class MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Multiples of " + number + " below 100 are:");
        for (int i = 1; i * number < 100; i++) {
            System.out.print(i * number + " ");
        }

        scanner.close();
    }
}
