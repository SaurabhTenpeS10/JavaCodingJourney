// Determine if a year is a leap year
import  java.util.Scanner;
public class Program6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Year to check is leap or not: ");
        int year = scanner.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0)
                  System.out.println("Year "+ year + " is leap year.");
                else
                    System.out.println("Year "+ year + " is not a leap year.");
            } else {
                System.out.println("Year "+ year + " is leap year.");
            }
        }

    }

}
