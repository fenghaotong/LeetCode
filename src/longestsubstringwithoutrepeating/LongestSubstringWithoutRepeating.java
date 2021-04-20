package longestsubstringwithoutrepeating;

public class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {
        String s = "abcabcab";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        if(s.length() <=1) return s.length();
        return 0;
    }
}
