package easy;

/**
 * 罗马数字包含以下七种字符:
 *
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
  思路：
 *   1. 对于罗马字符串，前面的字母如果是小值，就做减法，否则就做加法 ，最后一个肯定是加法(不要忘记了加上最后一个数)
 *   2. 从思路可知，我们需要比较两个字符的值，
 */
public class romanToInt {

    public int romanToInt(String s) {
        int preNum = getValue(s.charAt(0));
        int sum = 0;
        for (int i = 1; i < s.length(); i++) {
            int currentNum = getValue(s.charAt(0));
            if (preNum < currentNum) {
                sum = sum - preNum;
            } else {
                sum = sum + preNum;
            }
            preNum = currentNum;
        }
        //最后一位的数值不要忘了加
        sum += preNum;
        return sum;
    }

    private int getValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
