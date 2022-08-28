package easy;

public class ReplaceSpace {
    public String replaceSpace(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char charAt = s.charAt(i);
            if (charAt == ' ') {
                result.append("%20");
            } else {
                result.append(charAt);
            }
        }
        return result.toString();
    }
}
