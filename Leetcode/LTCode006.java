

public class LTCode006 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {
        LTCode006 solution = new LTCode006();
        int[] nums = { 1, 1, 2, 2, 3, 4 };
        int Length = solution.removeDuplicates(nums);

        System.out.println("New length: " + Length);
        System.out.print("Updated array: ");
        for (int i = 0; i < Length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
