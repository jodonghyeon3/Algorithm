class Solution {
    public int solution(String s) {
        int answer = 0;
        int sign = 1;
        int i = 0;
        if (s.charAt(0) == '-') {
            sign = -1;
            i = 1;
        }
        for (; i < s.length(); i++) {
            if (s.charAt(i) == '+') {
                i++;
            }
            int num = Character.getNumericValue(s.charAt(i));
            answer = answer * 10 + num;
        }
        return (answer * sign);
    }
}