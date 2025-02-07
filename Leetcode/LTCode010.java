import java.util.HashMap;
import java.util.Map;

public class LTCode010 {
    class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        
        return -1;
    }
}
public static void main(String[] args) {
    Solution solution = new LTCode010().new Solution();
    int[] nums = {4, 1, 2, 1, 2};
    System.out.println(solution.singleNumber(nums));
}
}