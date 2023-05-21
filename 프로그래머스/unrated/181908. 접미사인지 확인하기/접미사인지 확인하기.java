class Solution {
    public int solution(String my_string, String is_suffix) {
       String s = "";

        for (int i = 0; i < my_string.length(); i++) {
            s = my_string.substring(i, my_string.length());
            if (s.equals(is_suffix)) return 1;
        }

        return 0;
    }
}