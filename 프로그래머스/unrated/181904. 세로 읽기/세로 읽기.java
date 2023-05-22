class Solution {
    public String solution(String my_string, int m, int c) {
      String answer = my_string.substring(c - 1, c);
        int a = 0;
        for (int i = c; i < my_string.length(); i++) {
            a++;
            if (a % m == 0) answer += my_string.charAt(i);
        }
        return answer;
    }
}