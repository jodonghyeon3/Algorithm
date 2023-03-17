class Solution {
    public int solution(int n) {
        int answer = 0;
        int nOneCnt = Integer.bitCount(n);
        while (true) {
            n++;
            int mOneCnt = Integer.bitCount(n);
                if (nOneCnt == mOneCnt) {
                    answer = n;
                    break;
                }
        }
        return answer;
    }
}