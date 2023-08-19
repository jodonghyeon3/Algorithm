import java.util.*;

class Solution {
    static List<Integer> list = new ArrayList<>();

    public static int solution(int number, int limit, int power) {
        int answer = 0;
        
        for (int i = 1; i <= number; i++) {
            primeAdd(i, power, limit);
        }
        
        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i);
        }
        return answer;
    }

    public static void primeAdd(int n, int power, int limit) {
        int cnt = 0;
        
        for (int i = 1; i * i <= n; i++) {
            if (i * i == n) {
                cnt++;
            } else if (n % i == 0) {
                cnt += 2;
            }
            
        }
        
        if (cnt > limit) {
            list.add(power);
        } else {
            list.add(cnt);
        }
    }

}