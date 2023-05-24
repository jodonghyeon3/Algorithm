import java.util.ArrayList;
import java.util.Iterator;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int item : arr) {
            list.add(item);
        }
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                for (int j = query[i] + 1; j < list.size(); j++) {
                    list.remove(j);
                    j--;
                }
            } else {
                for (int j = query[i] - 1; j >= 0; j--) {
                    list.remove(j);
                }
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
