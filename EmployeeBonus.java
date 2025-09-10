import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your basic salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter your years of service: ");
        int years = scanner.nextInt();

        double bonus;
        if (years >= 10) {
            bonus = salary * 0.20;
        } else if (years >= 5) {
            bonus = salary * 0.10;
        } else {
            bonus = salary * 0.05;
        }

        System.out.println("Your bonus is: " + bonus);
        scanner.close();
    }
}
