package in.co.rays.basics.Exercise1;

public class Randomnumber {
    public static void main(String[] args) {
        int num = 5;
        long result = factorial(num);
        System.out.println("Factorial of " + num + " is: " + result);
    }

    public static long factorial(int n) {
        if (n < 0) return -1;
        if (n == 0 || n == 1) return 1; // Base case
        
        return n * factorial(n - 1); // Recursive call
    }
}