import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
       ArrayList<Integer> list = new ArrayList<>();
        for (int item : num_list) {
            list.add(item);
        }

        int last = list.get(list.size() -1);
        int lastFront = list.get(list.size() - 2);

        if (last > lastFront) {
            list.add(last - lastFront);
        } else {
            list.add(last * 2);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}