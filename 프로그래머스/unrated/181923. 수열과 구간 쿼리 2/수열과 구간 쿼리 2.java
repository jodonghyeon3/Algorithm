class Solution {
    public int[] solution(int[] arr, int[][] queries) {
   int[] result = new int[queries.length];
        
        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
            int answer = -1;
            
            for (int j = s; j <= e; j++) {
                if (arr[j] > k && (answer == -1 || arr[j] < answer)) {
                    answer = arr[j];
                }
            }
            
            result[i] = answer;
        }
        
        return result;
    }
}