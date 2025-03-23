// Calculate the factorial of a number

import  java.util.Scanner;
public class Program7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number to find Factorial: ");
        int num  = scanner.nextInt();
        int fact = 1;
        for(int i=1; i<=num; i++) {
            fact *= i;
        }
        System.out.println("Factorial of Given Number is: "+ fact);
    }
}
