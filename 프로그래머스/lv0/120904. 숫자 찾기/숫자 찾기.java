class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String b = "" + k;
        String a = " " + num;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b.charAt(0)) {
                answer = i;
                return answer;
            } 
        }
        return answer;
    }
}