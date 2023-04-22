import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int item : arr) {
            list.add(item);
        }
        
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int item = iterator.next();
            if (isDuple(item, delete_list)) {
                iterator.remove();
            }
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    
    public boolean isDuple(int item, int[] delete_list) {
        for (int i = 0; i < delete_list.length; i++) {
            if (item == delete_list[i]) {
                return true;
            }
        }
        return false;
    }
}
