import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        if (array == null || array.length == 0) {
            return 0; // or throw an exception
        }
        
        Arrays.sort(array);
        int left = array[0];
        int right = array[array.length - 1];
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= n) {
                left = array[i];
            } else {
                right = array[i];
                break;
            }
        }
        
        if (n - left <= right - n) {
            return left;
        } else {
            return right;
        }
    }
}