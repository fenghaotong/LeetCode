package scramblestring;

public class ScrambleString {
    public static void main(String[] args) {
        String s1 = "abcdbdacbdac";
        String s2 = "bdacasbcdbdac";
        System.out.println(isScramble(s1, s2));
    }

    public static boolean isScramble(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        if(s1.length() == 0 && s2.length() == 0) return true;
        if(s1.equals(s2)) return true;
        if(s1.length() <= 1 && s2.length() <= 1 && s1.equals(s2)) {
            return true;
        } else if(s1.length() > 1 && s1.length() > 1) {
            int i = s1.indexOf(s2.charAt(0));
            if(s1.length() == 2) {
                if(s1.equals(s2) || (s1.charAt(0) == s2.charAt(1) && s1.charAt(1) == s2.charAt(0))) {
                    return true;
                } else {
                    return false;
                }
            }
            return isScramble(s1.substring(0, i), s2.substring(1, i + 1)) && isScramble(s1.substring(i + 1), s2.substring(i + 1));
        } else {
            return false;
        }
    }
}