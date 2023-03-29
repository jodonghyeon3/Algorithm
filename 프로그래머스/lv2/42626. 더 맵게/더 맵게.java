import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> que = new PriorityQueue<>(scoville.length);
        for (int i = 0; i < scoville.length; i++) {
            que.add(scoville[i]);
        }
        int cnt = 0;
        while(!que.isEmpty() && que.peek() < K) {
            int a = que.remove();
            if(que.isEmpty()) {
                cnt = -1;
                break;
            }
            int b = que.remove();
            que.add(a + (b * 2));
            cnt++;
        }
        return cnt;
    }
}