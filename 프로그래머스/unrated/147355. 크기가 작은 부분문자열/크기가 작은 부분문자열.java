class Solution {
    public int solution(String t, String p) {
         int answer = 0;
        long pNum = Long.valueOf(p);
        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            long a = Long.valueOf(t.substring(i, p.length() + i));
            if (a <= pNum) {
                answer++;

            }
        }
        return answer;
    }
}