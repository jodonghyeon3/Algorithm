class Solution {
    public int solution(String my_string, String target) {
        for (int i = 0; i < my_string.length(); i++) {
            String s = my_string.substring(i, my_string.length());
            if (s.startsWith(target)) return 1;
        }
        return 0;
    }
}