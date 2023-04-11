import java.util.*;
class Solution {
    public int[] solution(int num, int total) {
        int m =(((total * 2) / num) + num - 1) / 2;
        ArrayList<Integer> a = new ArrayList();

        for (int i = m; i > m - num; i--) {
            a.add(i);
        }
        Collections.sort(a);
        return a.stream().mapToInt(Integer::intValue).toArray();
    }
}