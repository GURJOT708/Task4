import java.util.Scanner;

public class FriendsAgeHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Amar's age: ");
        int amarAge = scanner.nextInt();
        System.out.print("Enter Akbar's age: ");
        int akbarAge = scanner.nextInt();
        System.out.print("Enter Anthony's age: ");
        int anthonyAge = scanner.nextInt();

        System.out.print("Enter Amar's height (in cm): ");
        int amarHeight = scanner.nextInt();
        System.out.print("Enter Akbar's height (in cm): ");
        int akbarHeight = scanner.nextInt();
        System.out.print("Enter Anthony's height (in cm): ");
        int anthonyHeight = scanner.nextInt();

        // Find youngest
        int youngestAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));
        if (youngestAge == amarAge) {
            System.out.println("Amar is the youngest.");
        } else if (youngestAge == akbarAge) {
            System.out.println("Akbar is the youngest.");
        } else {
            System.out.println("Anthony is the youngest.");
        }

        // Find tallest
        int tallestHeight = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));
        if (tallestHeight == amarHeight) {
            System.out.println("Amar is the tallest.");
        } else if (tallestHeight == akbarHeight) {
            System.out.println("Akbar is the tallest.");
        } else {
            System.out.println("Anthony is the tallest.");
        }

        scanner.close();
    }
}
