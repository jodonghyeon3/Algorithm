import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        Deque que = new LinkedList();
        
        for (int item : people) {
            que.add(item);
        }

        while(!que.isEmpty()) {
            int sum = (int) que.peekFirst() + (int)que.peekLast();
            if (sum > limit) {
                answer++;
                que.pollLast();
            } else {
                answer++;
                que.pollLast();
                que.pollFirst();
            }
        }

        return answer;
    }
}