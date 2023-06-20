import java.util.Arrays;

class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int max = nums.length == 0 ? 0 : 1;
        for (int i = 0, len = 1; i < nums.length - 1; ++i) {
            if (nums[i] == nums[i + 1]) {
                continue;
            } else if (nums[i] == nums[i + 1] - 1) {
                len++;
            } else {
                len = 1;
            }
            max = Math.max(max, len);
        }
        return max;
    }
}