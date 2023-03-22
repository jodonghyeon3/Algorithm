class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String a = "";
        for (int item : array) {
            a += item;
        }
        for (char c : a.toCharArray()) {
            if (c == '7') {
                answer++;
            }
        }
        return answer;
    }
}