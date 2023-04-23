import java.util.*;

public class Solution {
    public int solution(int n) {
      String N = String.valueOf(n);
        int answer = 0;
        for(char c : N.toCharArray()) {
            answer += c - '0';
        }
        return answer;
    }
}