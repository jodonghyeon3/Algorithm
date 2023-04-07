import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        return Arrays.stream(numlist)
        		.boxed()
        		.sorted(Comparator.reverseOrder())
        		.sorted((o1, o2) -> Math.abs(o1-n) - Math.abs(o2-n))
        		.mapToInt(Integer::intValue)
        		.toArray();
    }
}
