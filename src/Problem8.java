import java.util.Scanner;

/**
 * Time Complexity: O(n)
 */
public class Problem8 {
    /**
     * Recursively checks if a string consists only of digits.
     * @param s The input string.
     * @param index The current index being checked.
     * @return true if the entire string consists of digits, false otherwise.
     */
    public static boolean isDigit(String s, int index) {
        if (index == s.length()) return true;
        if (!Character.isDigit(s.charAt(index))) return false;
        return isDigit(s, index + 1);
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
        System.out.print();
        String s = sc.nextLine();

        measureTime(() -> {
            if (isDigit(s, 0)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        });
    }
}
