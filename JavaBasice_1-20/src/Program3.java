// Calculate the sum of two numbers
import java.util.Scanner;
public class Program3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Two Number to Add: ");
        double num1 = sc.nextInt();
        double num2 = sc.nextInt();
        System.out.println("Sum of given number is: "+ (num1+num2));
    }
}
