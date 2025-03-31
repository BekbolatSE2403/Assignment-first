import java.util.Scanner;

/**
 * Time Complexity: O(2^n)
 */
public class Problem9 {
    /**
     * Computes the binomial coefficient using recursion.
     * @param n The total number of items.
     * @param k The number of selected items.
     * @return The binomial coefficient (n choose k).
     */
    public static int binomial(int n, int k) {
        if (n == k || k == 0) return 1;
        return binomial(n - 1, k - 1) + binomial(n - 1, k);
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
        int n = sc.nextInt();
        int k = sc.nextInt();

        measureTime(() -> {
            System.out.println(binomial(n, k));
        });
    }
}
