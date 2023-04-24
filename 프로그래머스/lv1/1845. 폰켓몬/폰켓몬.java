import java.util.*;
class Solution {
    public int solution(int[] nums) {
       int answer = nums.length / 2;
        HashSet<Integer> set = new HashSet<>();
        for(int item : nums) {
            set.add(item);
        }
        return answer <= set.size() ? answer : set.size();
    }
}