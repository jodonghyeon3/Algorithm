import java.util.*;
class Solution {
    public int solution(int[] numbers, int k) {
 int answer = 0;
        Deque<Integer> a = new java.util.LinkedList();

        for (int item : numbers) {
            a.add(item);
        }

        for(int i = 0; i< k; i++) {
            int num = a.pollFirst();
            int num2 = a.pollFirst();
            a.addLast(num);
            a.addLast(num2);
            answer =num;
        }
        return answer;
    }
}