import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public static int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            String s = String.valueOf(i);
            boolean isTarget = false;
            boolean allDigitsAreTarget = true;

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '5' || s.charAt(j) == '0') {
                    isTarget = true;
                } else {
                    allDigitsAreTarget = false;
                    break;
                }
            }

            if (isTarget && allDigitsAreTarget) {
                list.add(i);

            }
        }
        if (list.isEmpty()) list.add(-1);

        Collections.sort(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}