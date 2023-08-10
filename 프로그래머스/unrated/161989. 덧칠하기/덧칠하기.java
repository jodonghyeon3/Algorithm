class Solution {
    public int solution(int n, int m, int[] section) {
        int roll = section[0];
        int cnt = 1;
        for(int i = 1; i < section.length; i++) {
            if(roll + m - 1 < section[i]) {
                cnt++;
                roll = section[i];
            }
        }
        return cnt;
    }
}