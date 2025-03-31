import java.util.Scanner;

/**
 * Time Complexity: O(2^n) (Exponential time complexity due to recursion)
 */
public class Problem5 {
    /**
     * Computes the nth Fibonacci number using recursion
     * @param n position in the Fibonacci sequence
     * @return the nth Fibonacci number
     */
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
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

        measureTime(() -> {
            System.out.println(fibonacci(n));
        });
    }
}
