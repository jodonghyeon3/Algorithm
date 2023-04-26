import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
           int answer = 0;
        Arrays.sort(score);
        ArrayList<Integer> list = new ArrayList<>();

        for (int item : score) {
            list.add(item);
        }
        
        Collections.reverse(list);
        int cnt = 1;
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if(cnt == m) {
                sum += list.get(i) * m;
                cnt = 0;
            }
            cnt++;
        }

        return sum;
    }
}