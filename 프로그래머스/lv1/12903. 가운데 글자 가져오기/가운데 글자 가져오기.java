class Solution {
    public String solution(String s) {
         String answer = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.length() % 2 == 1 && s.length() / 2 == i)
                answer += s.charAt(i);
            else if ((s.length() % 2 == 0 && s.length() / 2 == i) || (s.length() % 2 == 0 && s.length() / 2 -1 == i) ) {
                answer += s.charAt(i);
            }
        }
        return answer;
    }
}