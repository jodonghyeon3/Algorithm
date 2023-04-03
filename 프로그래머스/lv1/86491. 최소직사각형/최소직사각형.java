import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
         int rowMax = Integer.MIN_VALUE;
        int colMax = Integer.MIN_VALUE;
        for (int i = 0; i < sizes.length; i++) {
            Arrays.sort(sizes[i]);
            if (rowMax < sizes[i][0]) {
                rowMax = sizes[i][0];
            }
            if (colMax < sizes[i][1]) {
                colMax = sizes[i][1];
            }

        }
        return rowMax * colMax;
    }
}