class Solution {
    public String solution(String s) {
        String answer = "";
        char[] sArr = s.toCharArray();
        for (int i = 0; i < sArr.length; i++) {
            if (sArr[i] >='0' && sArr[i] <= '9' && i == 0) {

            } else if (i == 0 || sArr[i - 1] == ' ') {
                sArr[i] = Character.toUpperCase(sArr[i]);
            } else {
                sArr[i] = Character.toLowerCase(sArr[i]);
            }
        }
        for (int i = 0; i < sArr.length; i++) {
            answer += sArr[i];
        }
        return answer;
    }
}