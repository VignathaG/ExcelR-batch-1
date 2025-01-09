public class Demo020 {
    
    public static int[] getFibonacciSeries(int n) {
        // If input is zero or negative, return an array with a single element 0
        if (n <= 0) {
            return new int[]{0};
        }

        // Create an array to store the Fibonacci sequence
        int[] fibonacciSeries = new int[n];

        // Base cases
        fibonacciSeries[0] = 0;
        if (n > 1) {
            fibonacciSeries[1] = 1;
        }

        // Generate the Fibonacci sequence
        for (int i = 2; i < n; i++) {
            fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
        }

        return fibonacciSeries;
    }

    public static void main(String[] args) {
        int n1 = 4;
        int[] result1 = getFibonacciSeries(n1);
        System.out.print("Input: " + n1 + " | Output: ");
        for (int num : result1) {
            System.out.print(num + " ");
        }

        System.out.println();  // New line

        int n2 = 7;
        int[] result2 = getFibonacciSeries(n2);
        System.out.print("Input: " + n2 + " | Output: ");
        for (int num : result2) {
            System.out.print(num + " ");
        }
    }
}
