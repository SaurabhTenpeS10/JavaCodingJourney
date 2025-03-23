// Convert temperature from Celsius to Fahrenheit
import java.util.Scanner;
public class Program11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1:  To convert temperature from Celsius into Fahrenheit: ");
        System.out.println("Enter 2:  To convert temperature from Fahrenheit into Celsius: " );
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("Enter Degree in Celsius to Convert in Fahrenheit: ");
                double celsius = scanner.nextDouble();
                double f = celsius * ((double) 9/5) + 32;
                System.out.println("Degree Celcius to Fahrenheit: "+ f);
                break;
            case 2:
                System.out.println("Enter Degree in Fahrenheit to Convert in Celcius: ");
                double fahrenheit = scanner.nextDouble();
                double c = (fahrenheit - 32) * ((double) 5 / 9);
                System.out.println("Degree Fahrenheit " + fahrenheit + " is equal to " + c + " in Celcius");
                break;
            default:
                System.out.println("Invalid Input!");

        }

    }
}
