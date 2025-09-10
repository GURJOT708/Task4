import java.util.Scanner;

public class RocketLaunchForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the countdown start number: ");
        int number = scanner.nextInt();

        for (int i = number; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println(" Blast Off!");

        scanner.close();
    }
}

