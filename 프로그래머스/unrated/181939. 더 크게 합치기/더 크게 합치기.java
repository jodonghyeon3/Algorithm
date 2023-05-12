class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String s = String.valueOf(a) +String.valueOf(b);
        String c = String.valueOf(b) + String.valueOf(a);
        return Integer.parseInt(s) > Integer.parseInt(c) ? Integer.parseInt(s) : Integer.parseInt(c);
    }
}