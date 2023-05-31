import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length;
        int targetLength = 1;
        
        while (targetLength < length) {
            targetLength *= 2;
        }
        
        int[] result = Arrays.copyOf(arr, targetLength);
        return result;
    }
}
