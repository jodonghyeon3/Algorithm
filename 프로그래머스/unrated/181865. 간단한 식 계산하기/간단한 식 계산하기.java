class Solution {
    public int solution(String binomial) {
        String[] s = binomial.split(" ");
        int answer = 0;
        if (s[1].equals("+")) {
            answer = Integer.parseInt(s[0]) + Integer.parseInt(s[2]);
        } else if (s[1].equals("-")) {
            answer = Integer.parseInt(s[0]) - Integer.parseInt(s[2]);
        } else {
            answer = Integer.parseInt(s[0]) * Integer.parseInt(s[2]);
        }
        return answer;
    }
}