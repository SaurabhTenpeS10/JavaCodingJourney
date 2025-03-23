// Print the Fibonacci series up to N _(Loops, Recursion)
public class Program1 {
    public static void main(String[] args) {
//        print5to1(5);
//        printSum(1,10,0);
//        int fact = calculateFactorial(5);
//        System.out.println(fact);
//       printFibonacci(0,1,10);
//        System.out.println(calcPower(2,3));
//        System.out.println(calcPowerWithLogNComplex(2,5));
        towerOfHonoi(3, "A", "B", "C");
    }


    public static void towerOfHonoi(int n, String src, String helper, String dest){

        if (n == 1) {
            System.out.println("Move disk 1 from " + src + " to " + dest);
            return;
        }
        towerOfHonoi(n-1, src, dest, helper);
        System.out.println("Move disk " + n + " from " + src + " to " + dest);
        towerOfHonoi(n-1, helper, src, dest);
    }

    public static int calcPower(int x, int n){
        if(n==0) return 1;
        if(x==0) return 0;
        return x * calcPower(x, n-1);
    }
    public static int calcPowerWithLogNComplex(int x, int n){
        if(n==0) return 1;
        if(x==0) return 0;
       if(n%2==0){
           // return calcPowerWithLogNComplex(x, n/2) * calcPowerWithLogNComplex(x, n/2);
           return calcPowerWithLogNComplex(x*x, n/2);
       }else {
           // return calcPowerWithLogNComplex(x, (n-1)/2) * calcPowerWithLogNComplex(x, (n-1)/2) * x;
           return calcPowerWithLogNComplex(x*x, (n-1)/2) * x;
       }
    }

    public static void printFibonacci(int a, int b, int n){
        if(n==0) return;
        System.out.println(a);
        printFibonacci(b, a+b, n-1);
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
