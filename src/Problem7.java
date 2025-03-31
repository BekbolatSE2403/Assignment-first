import java.util.Scanner;

/**
 * Time Complexity: O(n)
 */
public class Problem7 {
    /**
     * Reverses the elements of an array in-place.
     * @param arr The input array to be reversed.
     */
    public static void reverseArray(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
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
        int[] arr = new int[n];

        System.out.println();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        measureTime(() -> {
            reverseArray(arr);
        });

        System.out.println("Reversed array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
