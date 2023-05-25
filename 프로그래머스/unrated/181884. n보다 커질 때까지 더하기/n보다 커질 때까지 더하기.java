class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        for(int item : numbers) {
            answer += item;
            if (answer > n) break;
        }
        return answer;
    }
}