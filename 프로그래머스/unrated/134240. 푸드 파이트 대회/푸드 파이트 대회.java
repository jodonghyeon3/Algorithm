import java.util.*;
class Solution {
    public String solution(int[] food) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i]; j++) {
                if(j < food[i] /2) {
                    a.add(i);
                }
            }
        }
        a.add(0);
        for (int i = food.length - 1; i > 0; i--) {
            for (int j = 0; j < food[i]; j++) {
                if(j < food[i] / 2) {
                    a.add(i);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int item : a) {
            sb.append(item);
        }
        return sb.toString();
    }
}