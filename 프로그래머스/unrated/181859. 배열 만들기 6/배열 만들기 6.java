import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (list.isEmpty()) list.add(arr[i]);
            else {
                if(list.get(list.size() - 1) == arr[i]) {
                    list.remove(list.size() - 1);
                } else {
                    list.add(arr[i]);
                }
            }
        }
        if (list.isEmpty()) {
            list.add(-1);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}