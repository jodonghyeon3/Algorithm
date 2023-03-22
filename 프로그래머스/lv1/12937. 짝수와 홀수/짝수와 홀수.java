class Solution {
    public String solution(int num) {
        String answer = "";
            if (num >= 0) {
            if(num % 2 == 1) {
                answer = "Odd";
            } else {
                System.out.println(answer);
                answer = "Even";
            }
        } else {
            num *= -1;
            if(num % 2 == 1) {
                answer = "Odd";
            } else {
                System.out.println(answer);
                answer = "Even";
            }
        }
        return answer;
    }
}