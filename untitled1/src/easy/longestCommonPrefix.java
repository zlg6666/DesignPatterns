package easy;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 */
public class longestCommonPrefix {
    public String longestCommonPrefit(String[] str) {
        if (str.length == 0) return "";
        //1.取出字符串数组中第一个字符串，作为公共前缀
        String ans = str[0];
        //2.从第二个元素开始，遍历字符串数组
        for (int i = 1; i < str.length; i++) {
            //3。对于每个字符串和初始数组比较
            int j = 0;
            for (; j < ans.length() && j < str[i].length(); j++) {
                if (ans.charAt(j) != str[i].charAt(j))
                    break;
            }
            ans = ans.substring(0,j);
            if (ans.equals(""))
                return ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] str = new String[]{"flow","fl","flon"};
        String s = new longestCommonPrefix().longestCommonPrefit(str);
    }
}
