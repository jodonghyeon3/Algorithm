class Solution {
    public int solution(int a, int b, int n) {
        int cnt = 0;
        while(n / a > 0) {
            cnt += (n / a) * b;
            n = (n / a) * b + n % a;
        }
        return cnt;
        
    }
}