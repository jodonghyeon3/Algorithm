import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
         int cnt = 0;
        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
            answer += d[i];
            cnt++;
            if (budget < answer) {
                cnt--;
                break;
            }
        }
        return cnt;
    }
    
}