
import java.util.Scanner;

public class problem3 {
    /**
     * Complexity: O(n)
     * This method defines the number is prime or composite
     * @param n given number
     * @return true if the number is prime, false otherwise.
     */
    public static boolean isPrime(int n) {
        if (n <=1) return false;
        if(n == 2) return true;

        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    /**
     * Measures execution time of a function in milliseconds.
     * @param r The function to be executed.
     */
    public static void measureTime(Runnable r) {
        long startTime = System.nanoTime();
        r.run();
        long endTime = System.nanoTime();
        System.out.println("Time taken: " + (endTime - startTime) / 1000000.0 + " ms");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int n = sc.nextInt();
        sc.close();

        if(isPrime(n)) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }

        measureTime(() -> {
            System.out.println(isPrime(n));
        });
    }
}