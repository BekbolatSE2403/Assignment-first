import java.util.Scanner;

/**
 * Time Complexity: O(log(min(a, b)))
 */
public class Problem10 {
    /**
     * Computes the GCD using Euclidean algorithm.
     * @param a The first number.
     * @param b The second number.
     * @return The greatest common divisor of a and b.
     */
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
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
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        measureTime(() -> {
            System.out.println(gcd(a, b));
        });
    }
}
