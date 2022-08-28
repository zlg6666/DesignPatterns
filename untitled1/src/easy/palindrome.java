package easy;

/**
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 *
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * 例如，121 是回文，而 123 不是。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/palindrome-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

/**
 * 思路 ：把整数反转一半，取出后半段的反转数，和前半段剩余的数对于。
 * 怎么能知道什么时候才能反转一半呢？当前半段的数小于等于后半段的数的时候，就说明反转了一半了（仔细思考）
 * 边界条件： 负数不成立，个位数为0的不成立（0除外）
 *
 */

public class palindrome {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;
        int revertNum = 0;
        while (x > revertNum) {
            revertNum = revertNum * 10 + x % 10;
            x /= 10;
        }
        //没有考虑到奇数的时候，当输入为12321时，在while循环后，我们得到的revertNum是123 ，这时就需要把最后一个3去掉
        return revertNum == x || revertNum / 10 ==x;
    }
}
