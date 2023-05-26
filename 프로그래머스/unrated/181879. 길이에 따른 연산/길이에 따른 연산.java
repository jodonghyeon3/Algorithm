import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        int answer = 1;
        if (num_list.length <= 10) {
            for (int i = 0; i < num_list.length; i++) {
                answer *= num_list[i];
            }
            return answer;
        } else {
            return Arrays.stream(num_list).sum();
        }
    }
}