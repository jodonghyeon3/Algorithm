class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        char kC = (char) (k + '0');
        for (int l = i; l <= j; l++) {
            String Js = "" + l;
            for (char a : Js.toCharArray()) {
                if (a == kC) {
                    answer++;
                }
            }

        }
        return answer;
    }
}