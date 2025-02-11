public class Demo073 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 4, 6, 8, 10};
        
        System.out.println("Duplicate elements in the array:");
        findDuplicates(numbers);
    }

    public static void findDuplicates(int[] arr) {
        boolean[] visited = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && !visited[j]) {
                    System.out.print(arr[i] + " ");
                    visited[j] = true;
                    break;
                }
            }
        }
        System.out.println();
    }
}
