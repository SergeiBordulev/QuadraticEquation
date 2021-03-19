import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a value A:");
        double a = scanner.nextDouble();

        System.out.println("Enter a value B:");
        double b = scanner.nextDouble();

        System.out.println("Enter a value C:");
        double c = scanner.nextDouble();

        double epsilon = 1.0e-10;

        if (Math.abs(a) < epsilon) {
            if (Math.abs(b) < epsilon) {
                if (Math.abs(c) < epsilon) {
                    System.out.println("There are an infinite number of roots.");
                } else {
                    System.out.println("No roots!");
                }
            } else {
                double x = -c / b;

                System.out.println("x = " + x);
            }
        } else {
            double discriminant = Math.pow(b, 2) - 4 * a * c;

            System.out.println("Solving the quadratic equation");
            System.out.println("The discriminant is equal to: " + discriminant);

            if (discriminant < -epsilon) {
                System.out.println("Since the discriminant is less than zero, the equation has no valid solutions.");
            } else if (Math.abs(discriminant) <= epsilon) {
                double x = -b / (2 * a);

                System.out.println("The equation has one root");
                System.out.printf("Root X = %.4f", x);
            } else {
                double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);

                System.out.println("The equation has two roots");
                System.out.printf("Root Х1 = %.4f%nRoot Х2 = %.4f", x1, x2);
            }
        }
    }
}
