import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (a, b) -> {
            if (a.charAt(n) != b.charAt(n)) {
                return Character.compare(a.charAt(n), b.charAt(n));
            } else {
                return a.compareTo(b);
            }
        });
        return strings;
    }

    public static String[] compare(String[] strings) {
        Arrays.sort(strings, (a, b) -> {
            if (a.charAt(0) != b.charAt(0)) {
                return Character.compare(a.charAt(0), b.charAt(0));
            } else {
                return a.compareTo(b);
            }
        });
        return strings;
    }
}
