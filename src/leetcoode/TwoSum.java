package leetcoode;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        int[] num = {2, 1, 5, 4, 7};
        int target = 9;
        int[] indices = solution.twoSum(num, target);
        System.out.println("Indices: [" + indices[0] + ", " + indices[1] + "]");
    }
}
