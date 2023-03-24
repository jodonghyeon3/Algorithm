class Solution {
    public String[] solution(String my_str, int n) {
        int numSubstrings = (int) Math.ceil((double) my_str.length() / n);
        String[] answer = new String[numSubstrings];
        int startIndex = 0;
        for (int i = 0; i < numSubstrings; i++) {
            int endIndex = Math.min(startIndex + n, my_str.length());
            answer[i] = my_str.substring(startIndex, endIndex);
            startIndex += n;
        }
        return answer;
    }
}