import java.util.*;
class Solution {
    public String[] solution(String[] quiz) {
       String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            if (!isCollect(quiz[i])) {
                answer[i] = "X";
            } else {
                answer[i] = "O";
            }

        }
        return answer;
    }
    public boolean isCollect(String s) {
         String[] sArr = s.split(" ");
        if (sArr[1].equals("-")) {
            return Integer.valueOf(sArr[0]) - Integer.valueOf(sArr[2]) == Integer.valueOf(sArr[4]) ? true : false;
        } else {
            return Integer.valueOf(sArr[0]) + Integer.valueOf(sArr[2]) == Integer.valueOf(sArr[4]) ? true : false;
        }


    }
}