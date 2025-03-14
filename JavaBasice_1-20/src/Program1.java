// Print the Fibonacci series up to N _(Loops, Recursion)
public class Program1 {
    public static void main(String[] args) {
//        print5to1(5);
//        printSum(1,10,0);
        int fact = calculateFactorial(5);
        System.out.println(fact);
    }

    public static int calculateFactorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        int fact_nm1 = calculateFactorial(n-1);
        int fact_n = fact_nm1 * n;
        return  fact_n;
    }

    public static void print5to1(int n){
        if(n==0) return;
        System.out.println(n);
        print5to1(n-1);
    }

    public static void printSum(int i, int n, int sum){
        if(i==n) {
            sum += i;
            System.out.println(sum);
            return;
        };
        sum += i;
        printSum(i+1, n, sum);
    }
}
