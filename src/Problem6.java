import java.util.Scanner;

/**
 * Time Complexity: O(n)
 */
public class Problem6 {
    /**
     * Computes the power of a number using recursion.
     * @param a The base number.
     * @param n The exponent.
     * @return The result of a raised to the power n.
     */
    public static int power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
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
        int a = sc.nextInt();
        System.out.println();
        int n = sc.nextInt();
        sc.close();

        measureTime(() -> {
            System.out.println(power(a, n));
        });
    }
}
