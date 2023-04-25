class Solution {
    public int solution(int[] nums) {
       
        int primeCnt = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (isPrime((nums[i] + nums[j] + nums[k])))
                        primeCnt++;
                }
            }
        }
        return primeCnt;
    }
    public boolean isPrime(int num) {
        for(int i = 2; i < num /2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}