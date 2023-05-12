class Solution {
    public int solution(int a, int b) {
        int answer = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        return answer > a * 2 * b ? answer : a * 2 * b;
    }
}