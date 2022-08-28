package easy;

import java.util.HashMap;

/**
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 *
 * 你可以按任意顺序返回答案。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

/**
 * 思路： 首先创建一个hashmap 用来存储数组
 * 1。遍历数组，判断hashmap 的key中是否存在 target - num[i] 的值，
 * 2。如果存在就说明当前的值num[i]和  target - num[i] 和为target 那我们就找到这两个值了，那就取出这个两个值的下标，创建新的int数
 * 3。 如果不存在，我们就把当前的值，num[i] i 当作key和value键值对，将其存入到hashmap中
 */
public class number1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(integerIntegerHashMap.containsKey(target - nums[i])) {
                return new int[]{integerIntegerHashMap.get(target-nums[i]),i};
            }
            integerIntegerHashMap.put(nums[i],i);
        }
        return new int[0];
    }
}
