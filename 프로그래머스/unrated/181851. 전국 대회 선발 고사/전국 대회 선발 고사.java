import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int[][] rankIndex = new int[rank.length][2];

        for (int i = 0; i < rank.length; i++) {
            rankIndex[i][0] = rank[i];
            rankIndex[i][1] = i;
        }

        Arrays.sort(rankIndex, (a, b) -> a[0] - b[0]);
        ArrayList result = new ArrayList<>();

        for (int i = 0; i < attendance.length; i++) {
            if (attendance[rankIndex[i][1]]) {
                result.add(rankIndex[i][1]);
            }
            if (result.size() == 3) {
                break;
            }
        }

        int first = (int) result.get(0) * 10000;
        int second = (int) result.get(1) * 100;
        int third = (int) result.get(2);
        answer = first + second + third;

        return answer;
    }
}