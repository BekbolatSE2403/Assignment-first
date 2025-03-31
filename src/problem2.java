import java.util.Scanner;

public class problem2{
    /**
     *  Finding the average of given array
     * @param arr Array contains all the numbers.
     * @return The average of given numbers
     * Time complexity: O(n)
     */
    public static double average(int[] arr){
        double sum=0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum / arr.length;
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

    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(average(arr));

        measureTime(() -> {
            System.out.println("Average: " + average(arr));
        });
    }

}
