class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pCount = 0;
        int yCount = 0;
        for (char c : s.toCharArray()) {
            if(c == 'y' || c == 'Y') {
                yCount ++;
            } else if(c == 'p' || c == 'P') {
                pCount ++;
            } 
        }
        if (pCount == yCount) {
            answer = true;
        } else if(pCount == 0 && yCount == 0) {
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }
}