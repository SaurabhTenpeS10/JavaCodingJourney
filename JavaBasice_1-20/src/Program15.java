// Reverse a given number

import java.util.Scanner;
public class Program15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to reverse it: ");
        int num = scanner.nextInt();
        System.out.print("Given Number "+num);
        int rev = 0;
        while(num>0){
            int rem = num%10;
            rev = rev*10+rem;
            num /= 10;
        }
        System.out.println(" Reverse is "+ rev);
    }
}
