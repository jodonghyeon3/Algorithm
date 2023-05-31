import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public static int solution(String[] strArr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < strArr.length; i++) {
            map.put(strArr[i].length(), map.getOrDefault(strArr[i].length(), 0) + 1);
        }

        int min = Integer.MIN_VALUE;
        for(int a : map.values()) {
            min = Math.max(a,min);
        }
        return min;
    }

    public static void main(String[] args) {
        String[] s = {"a", "bc", "d", "efg", "hi"};
        solution(s);
    }
}