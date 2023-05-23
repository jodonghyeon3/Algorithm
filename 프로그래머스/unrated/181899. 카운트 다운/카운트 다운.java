import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int start, int end) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = start; i >= end; i--) list.add(i);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}