class Solution {
    public String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for (int i = 1; i < numLog.length; i++) {
            sum = numLog[i] - numLog[i - 1];
            if (sum == 1) sb.append("w");
            else if (sum == -1) sb.append("s");
            else if (sum == 10) sb.append("d");
            else sb.append("a");
        }


        return sb.toString();
    }
}