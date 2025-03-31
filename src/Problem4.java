import java.util.Scanner;

public class Problem4 {
    /**
     * Complexity: O(n)
     * This method finds factorial of given number
     * @param n Input number
     * @return Returns factorial of number
     */
    public static int factorial(int n) {
        if(n == 0 || n == 1 ) return 1;
        return n * factorial(n-1);
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
        System.out.println(factorial(n));

        measureTime(() -> {
            System.out.println("Factorial: " + factorial(n));
        });
    }
}