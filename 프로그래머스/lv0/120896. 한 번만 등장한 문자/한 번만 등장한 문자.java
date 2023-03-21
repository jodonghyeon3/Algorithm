import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sArr = s.split("");
        Arrays.sort(sArr);
        
        for (int i = 0; i < sArr.length; i++) {
            int count = 0;
            for (int j = 0; j < sArr.length; j++) {
                if(sArr[i].equals(sArr[j])) {
                    count ++;
                }
            }
            if (count == 1) {
                answer += sArr[i];
            }
        }
        return answer;
    }
}