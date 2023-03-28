class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {lcm(n,m),gcd(n,m)};
        return answer;
    }
    public int lcm(int num1, int num2) {
        while (num2 != 0) {
        int temp = num2;
        num2 = num1 % num2;
        num1 = temp;
        }
        return num1;
    
        
    }
    public int gcd(int n, int m) {
        if (n < m) {
                for (int i = 1; i <= m; i++) {
                    if ((n * i) % m == 0) {
                        return n * i;
                    }
                }
            } else {
                for (int i = 1; i <= n / 2; i++) {
                    if ((m * i) % n == 0) {
                        return m * i;
                    }

                }
            }
            return 0;
    }
}