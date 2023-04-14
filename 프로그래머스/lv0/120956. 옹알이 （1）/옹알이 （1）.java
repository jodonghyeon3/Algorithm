import java.util.*;
class Solution {
    public int solution(String[] babbling) {
         int answer = 0;
        String[] oArr = {"aya", "ye", "woo", "ma"};

        for (String b : babbling) {
            String a = b;

            // 중복 문자열 제거
            Set<String> oSet = new HashSet<>(Arrays.asList(oArr));
            for (String o : oSet) {
                a = a.replaceAll(o, "_");
            }

            // "_" 문자열 제거
            a = a.replaceAll("_", "");
            if (a.isEmpty()) {
                answer++;
            }
        }

        return answer;
    }
}