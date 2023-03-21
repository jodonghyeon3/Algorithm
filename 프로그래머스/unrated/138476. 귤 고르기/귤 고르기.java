import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
       int answer = 0;
        Map<Integer, Integer> a = new HashMap<>();

        for (int item : tangerine) {
            a.put(item, a.getOrDefault(item, 0) + 1);
        }

        int sum = 0;

        List<Integer> list = new ArrayList<>();
        for (Integer item : a.keySet()) {
            list.add(a.get(item));
        }
        list.sort(Collections.reverseOrder());

        for (Integer item : list) {
            answer++;
            sum += item;
            if (sum >= k) {
                break;
            }
        }

        return answer;
    }
}