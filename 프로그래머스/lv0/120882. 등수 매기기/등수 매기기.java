import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
        int[] result = new int[score.length];
        int[] grade = new int[score.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = score[i][0] + score[i][1];
        }
        System.out.println(Arrays.toString(result));
        int[] jumsu = result.clone();
        Arrays.sort(jumsu);
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < jumsu.length; i++) {
            map.put(jumsu[i], jumsu.length -i );
        }

        for (int i = 0; i < grade.length; i++) {
            grade[i] = map.get(result[i]);
        }
        return grade;
    }
}