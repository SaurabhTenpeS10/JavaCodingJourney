// Print all prime numbers up to n

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Program14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        List<Integer> primeNumbers = findPrimeNumbers(num);
        System.out.println(primeNumbers);
    }

    private static List<Integer> findPrimeNumbers(int num) {
        List<Integer> primeNumbers = new ArrayList<>();
        for(int i=2; i<=num; i++){
            boolean isPrime = true;
            for(int j=2; j<=i/2; j++){
               if(i%j==0){
                   isPrime = false;
                   break;
               }

            }
            if(isPrime)
                primeNumbers.add(i);
        }
        return primeNumbers;
    }
}
