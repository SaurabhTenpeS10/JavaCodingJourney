// Find the largest among three numbers
import java.util.Scanner;
public class Program13 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter three numbers to find the largest among three: ");
        double num1= scanner.nextDouble();
        double num2= scanner.nextDouble();
        double num3= scanner.nextDouble();

        if(num1 > num2 && num1 > num3){
            System.out.println(num1 + " is greatest among all.");
        } else if(num2 > num1 && num2>num3){
            System.out.println(num2 + " is greatest among all.");
        } else {
            System.out.println(num3 + " is greatest among all.");
        }

    }
}
