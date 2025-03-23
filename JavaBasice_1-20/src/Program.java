// Find the sum of digits in a number
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number to Find Sum of digits: ");
        int num = scanner.nextInt();
        int sum = 0;
        while (num>0){
            int rem = num%10;
            sum += rem;
            num /=10;
        }
        System.out.println("Sum of Digits of Given Number " + sum);
    }
}
