import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String a = String.valueOf(n);
        long[] b = new long[a.length()];
        for (int i = 0; i < a.length(); i++) {
            b[i] = Long.parseLong(String.valueOf(a.charAt(i)));
        }
        Arrays.sort(b);
        for (int i = 0; i < b.length / 2; i++) {
            long temp = b[i];
            b[i] = b[b.length - 1 - i];
            b[b.length - 1 - i] = temp;
        }
        long answer = 0;
        for (int i = 0; i < b.length; i++) {
            answer += b[i] * Math.pow(10, b.length - i - 1);
        }
        return answer;
    }
}
