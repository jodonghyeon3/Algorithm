class Solution {
    public static int solution(String my_string, String is_prefix) {
        String s = "";
        int answer = 0;
        for (char c : my_string.toCharArray()) {
            s += c;
            if (s.equals(is_prefix)) {
                answer = 1;
            }
        }
        return answer;
    }
}