// Generate the Fibonacci sequence up to n terms
import java.util.Scanner;
public class Program8 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter n term to Generate Fibonacci Sequence: ");
        int n = scanner.nextInt();
        int first = 0, second = 1, next = 1;
        System.out.println("Option 1");
        System.out.print(first+"   "+second);
        for(int i=0; i<n-2; i++){
            System.out.print("   "+next);
            first = second;
            second = next;
            next  = first + second;
        }

        System.out.println("\nOption 2");
        first = 0;
        second= 1;
        for(int i=0; i<n; i++){
            System.out.print(first +  "   ");
            int nxt = first + second;
            first = second;
            second = nxt;

        }
    }
}
