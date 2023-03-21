class Solution {
    public String solution(String letter) {
         String answer = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        for (String a : letter.split(" ")) {
            for (int i = 0; i < morse.length; i++) {
                if (a.equals(morse[i])) {
                    answer += (char) ('a' + i);
                }
            }
        }
        return answer;
    }
}