import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> table = new HashSet<>();
        for (int num : nums) {
            if (table.contains(num)) {
                return true;
            } else {
                table.add(num);
            }
        }
        return false;
    }
}