class Solution {
    public int solution(int a, int b, int c) {
       if ((a == b && a != c) || (a == c && a != b) || (b == c && b != a)) {
            return (int) ((a + b + c) * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)));
        } else if (a == b && a == c) {
            return (int) ((int) a * 3 * (Math.pow(a,2) * 3) * (Math.pow(a,3) * 3));
        } else return a + b + c;
    }
}