// Print multiplication table for a given number
import java.util.Scanner;
public class Program9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number to print Multiplication Table: ");
        int number = scanner.nextInt();
        int i=1;
       while(i <= 10){
           System.out.println(number+"*"+i+"="+number*i);
           i++;
       }
    }

}
