import java.util.Scanner;

public class SmallestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        if (num1 < num2 && num1 < num3) {
            System.out.println("The first number (" + num1 + ") is the smallest.");
        } else {
            System.out.println("The first number (" + num1 + ") is NOT the smallest.");
        }

        scanner.close();
    }
}
 
