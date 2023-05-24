import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 2) {
                min = Math.min(min,i);
                max = Math.max(max,i);
            }
        }
        
        if (min == Integer.MAX_VALUE && max == Integer.MIN_VALUE) {
            list.add(-1);
        } else {
            for (int i = min; i <= max; i++) {
                list.add(arr[i]);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    
}