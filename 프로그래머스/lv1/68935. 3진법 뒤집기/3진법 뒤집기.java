class Solution {
    public static int solution(int n) {
        String s = "";
        String aw = toThree(n, s);
        return Integer.parseInt(aw,3);
    }
    public static String toThree(int n, String s) {
        if ( n < 3) {
            return s +="" +n;
        }
        s += "" + n%3;
        return toThree(n/3, s);
    }
}