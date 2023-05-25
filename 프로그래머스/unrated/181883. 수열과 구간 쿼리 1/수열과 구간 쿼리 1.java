class Solution {
    public int[] solution(int[] arr, int[][] queries) {
       int n = arr.length;

        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];

            for (int i = start; i <= end; i++) {
                arr[i]++;
            }
        }

        return arr;
    }
}