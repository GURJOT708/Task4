import java.util.Scanner;

public class MultiplesBelow100While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Multiples of " + number + " below 100 are:");

        int i = 1;
        while (i * number < 100) {
            System.out.print(i * number + " ");
            i++;
        }

        scanner.close();
    }
}

