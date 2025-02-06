import java.util.Arrays;

public class Demo064 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7};
        System.out.println("Before Swapping: " + Arrays.toString(arr));
        arr[0] = arr[0] + arr[3];
        arr[3] = arr[0] - arr[3];
        arr[0] = arr[0] - arr[3];
        System.out.println("After Swapping: " + Arrays.toString(arr));
    }
}
