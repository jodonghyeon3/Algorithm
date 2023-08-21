
import java.util.*;

class Solution {
    public static int solution(int n, int[] lost, int[] reserve) {

        int[] dp = new int[n + 2];

        for (int i : lost) {
            dp[i]--;
        }

        for (int i : reserve) {
            dp[i]++;
        }

        for (int i = 1; i <= n; i++) {
            if (dp[i] == -1) {
                if (dp[i - 1] == 1) {
                    dp[i - 1]--;
                    dp[i]++;
                } else if (dp[i + 1] == 1) {
                    dp[i + 1]--;
                    dp[i]++;
                }
            }
        }
        
        int cnt = 0;

        for (int i = 0; i < dp.length; i++) {
            if(dp[i] >= 0) cnt++;
        }

//        int answer = 0;
//        List<Integer> lostList = new ArrayList<>();
//        List<Integer> reseList = new ArrayList<>();
//
//
//        for (int a : lost) {
//            lostList.add(a);
//        }
//
//        for (int a : reserve) {
//            reseList.add(a);
//        }
//
//        Collections.sort(lostList);
//        Collections.sort(reseList);
//
//        for (int i = 0; i < lostList.size(); i++) {
//            for (int j = 0; j < reseList.size(); j++) {
//                if (lostList.get(i) - 1 == reseList.get(j) || lostList.get(i) + 1 == reseList.get(j)) {
//                    reseList.remove(j);
//                    answer++;
//                }
//            }
//        }
//
//        return n - (lost.length - answer);
        return cnt - 2;
    }

    public static void main(String[] args) {
        System.out.println(solution(5, new int[]{2, 4}, new int[]{3}));
    }
}