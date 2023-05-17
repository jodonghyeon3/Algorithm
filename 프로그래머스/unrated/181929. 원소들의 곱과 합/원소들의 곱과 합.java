import java.util.*;
class Solution {
    public int solution(int[] num_list) {
        int sum = (int) Math.pow(Arrays.stream(num_list).sum(), 2);
        int mod = 1;
        for(int item : num_list) mod *= item;
        return sum > mod ? 1 : 0;
    }
}