import java.util.Scanner;

public class EmployeeBonu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter your years of service: ");
        int years = scanner.nextInt();

        double bonus = 0;

        if (years > 5) {
            bonus = salary * 0.05;
        }

        System.out.println("Your bonus is: " + bonus);
        scanner.close();
    }
}
