// Check if a number is prime
import java.util.Scanner;
public class Program10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to check given number is prime or not: ");
        int num = scanner.nextInt();
        boolean flag = false;
        for(int i=2; i<num/2; i++){
            if(num%i==0){
                flag = true;
            }
        }
        if(flag){
            System.out.println("Given Number "+num+" is not Prime Number.");
        } else {
            if(num<=1)
                System.out.println("Given Number "+num+" is Not Prime Number.");
            else
                System.out.println("Given Number "+num+" is Prime Number.");
        }
    }
}
