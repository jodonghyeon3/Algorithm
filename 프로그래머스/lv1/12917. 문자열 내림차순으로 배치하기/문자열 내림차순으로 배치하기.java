class Solution {
    public String solution(String s) {
   String upper = "";
        String lower = "";
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                upper += s.charAt(i);
            } else {
                lower += s.charAt(i);
            }
        }
        StringBuilder sb = new StringBuilder(lower);
        for (int i = 0; i < sb.length(); i++) {
            for (int j = i + 1; j < sb.length(); j++) {
                if (sb.charAt(i) < sb.charAt(j)) {
                    char temp = sb.charAt(i);
                    sb.setCharAt(i, sb.charAt(j));
                    sb.setCharAt(j, temp);
                }
            }
        }
        answer += sb.toString();
        sb = new StringBuilder(upper);
        for (int i = 0; i < sb.length(); i++) {
            for (int j = i + 1; j < sb.length(); j++) {
                if (sb.charAt(i) < sb.charAt(j)) {
                    char temp = sb.charAt(i);
                    sb.setCharAt(i, sb.charAt(j));
                    sb.setCharAt(j, temp);
                }
            }
        }
        answer += sb.toString();
    return answer;
    }
}