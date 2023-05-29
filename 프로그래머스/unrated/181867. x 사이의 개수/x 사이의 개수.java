import java.util.*;

class Solution {
    public int[] solution(String myString) {
    String[] array = myString.split("x", -1);
        List<Integer> lengths = new ArrayList<>();

        for (String str : array) {
            lengths.add(str.length());
        }

        int[] result = new int[lengths.size()];
        for (int i = 0; i < lengths.size(); i++) {
            result[i] = lengths.get(i);
        }

        return result;
    }
}