package easy;

import java.util.HashMap;

public class findRepeatNumber {
    public int findRepeatNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return nums[i];
            } else {
                map.put(nums[i],i);
            }
        }
        return -1;
    }
}
