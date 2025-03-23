import java.util.Scanner;

// Find the average of three numbers
public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Number to find Average: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        System.out.println("Average of given number is: "+ (num1+num2+num3)/3);
    }
}
