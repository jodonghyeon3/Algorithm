class Solution {
    public static int solution(String myString, String pat) {
        int answer = 0;
        for (int i = 0; i < myString.length() - pat.length() + 1; i++) {
            if (pat.equals(myString.substring(i, pat.length() + i))) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "banana";
        String a = "ana";
        System.out.println(solution(s, a));
    }
}