// Calculate area and perimeter of basic shapes
import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a shape:");
        System.out.println("1. Rectangle");
        System.out.println("2. Square");
        System.out.println("3. Circle");
        System.out.println("4. Triangle");
        System.out.println("5. Ellipse");
        System.out.println("6. Trapezoid");
        int choice = scanner.nextInt();

        switch(choice) {
            case 1: rectangle(scanner);
                    break;
            case 2: square(scanner);
                    break;
            case 3: circle(scanner);
                    break;
            case 4: triangle(scanner);
                    break;
            case 5: ellipse(scanner);
                    break;
            case 6: trapezoid(scanner);
                    break;
            default: System.out.println("Invalid choice!");
        }

    }

    private static void rectangle(Scanner scanner) {
        System.out.println("Enter length:");
        double length = scanner.nextDouble();
        System.out.println("Enter width:");
        double width = scanner.nextDouble();
        double area = length * width;
        double perimeter = 2 * (length+width);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }

    private static void square(Scanner scanner) {
        System.out.println("Enter side length:");
        double side = scanner.nextDouble();
        double area = side * side;
        double perimeter = 4 * side;
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }

    private static void circle(Scanner scanner) {
        System.out.println("Enter radius:");
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Area: " + area);
        System.out.println("Perimeter (Circumference): " + perimeter);
    }

    private static void triangle(Scanner scanner) {
        System.out.println("Enter base length:");
        double base = scanner.nextDouble();
        System.out.println("Enter height:");
        double height = scanner.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("Enter side lengths (a, b, c):");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double perimeter = a + b + c;
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }

    private static void ellipse(Scanner scanner) {
        System.out.println("Enter semi-major axis length:");
        double a = scanner.nextDouble();
        System.out.println("Enter semi-minor axis length:");
        double b = scanner.nextDouble();
        double area = Math.PI * a * b;
        double perimeter = Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }

    private static void trapezoid(Scanner scanner) {
        System.out.println("Enter parallel side lengths (a, b):");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.println("Enter height:");
        double height = scanner.nextDouble();
        double area = 0.5 * (a + b) * height;
        System.out.println("Enter side lengths (c, d):");
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double perimeter = a + b + c + d;
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}
