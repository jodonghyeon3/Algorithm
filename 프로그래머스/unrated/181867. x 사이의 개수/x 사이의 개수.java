import java.util.*;

class Solution {
    public int[] solution(String myString) {
        String[] array = myString.split("x", -1);
        List<Integer> lengths = new ArrayList<>();

        for (String str : array) {
            lengths.add(str.length());
        }

        return lengths.stream().mapToInt(Integer::intValue).toArray();
    }
}