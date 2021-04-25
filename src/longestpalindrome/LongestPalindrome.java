package longestpalindrome;

public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "ababac";
        System.out.println(longestPalindrome(s));
    }
    public static String longestPalindrome(String s) {
        if (s.length() < 2) return s;

        int start = 0;
        int maxLen = 0;

        for(int i = 0; i < s.length(); i ++){
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > maxLen) {
                start = i - (len - 1) / 2;
                maxLen = len;
            }
        }
        return s.substring(start, start + maxLen);
    }

    public static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            --left;
            ++right;
        }
        return right - left - 1;
    }
}
