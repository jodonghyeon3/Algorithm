class Solution {
    public static int solution(String s) {
      char x = s.charAt(0);
		int xCnt = 0;
		int yCnt = 0;
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			if (xCnt == yCnt) {
				result++;
				x = s.charAt(i);
			}
			if (s.charAt(i) == x) xCnt++;
			else yCnt++;
		}
		return result;
    }

    public static void main(String[] args) {
        System.out.println((solution("aaabbbacccabba")));
    }
}