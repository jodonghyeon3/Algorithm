class Solution {
    public int solution(int n, int m, int[] section) {
        
        int max = 0;
        int cnt = 0;
        
        for (int num : section) {
            if (max <= num) {
                max = num + m;
                cnt++;
            }
        }
        return cnt;
    }
}
