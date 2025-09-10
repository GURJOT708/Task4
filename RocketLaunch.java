import java.util.Scanner;

public class RocketLaunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the countdown start number: ");
        int number = scanner.nextInt();
        while (number > 0) {
            System.out.println(number);
            number--;
        }

        System.out.println(" Blast Off!");
        
        scanner.close();
    }
}
