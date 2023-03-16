
public class Solution {
    public int[] solution(String s) {
        int count = 0;
        int zeroCnt = 0;
        while (!s.equals("1")) {
            int len = s.length();
            s = s.replaceAll("0", "");
            zeroCnt += len - s.length();
            s = Integer.toBinaryString(s.length());
            count++;
        }
        return new int[]{count, zeroCnt};
    }
}
