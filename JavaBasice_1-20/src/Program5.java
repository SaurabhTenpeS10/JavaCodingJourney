// Check if a number is even or odd

import java.util.Scanner;
public class Program5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number to Check Number is Even or Odd");
        int num = scanner.nextInt();

        if(num%2==0){
            System.out.println("Given Number "+num + " is Even.");
        } else {
            System.out.println("Given Number "+num + " is Odd.");
        }
    }
}
