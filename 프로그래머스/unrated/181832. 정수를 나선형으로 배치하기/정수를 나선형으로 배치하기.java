class Solution {
    public int[][] solution(int n) {
   int[][] result = new int[n][n];
        int num = 1;
        int rowStart = 0, rowEnd = n - 1;
        int colStart = 0, colEnd = n - 1;

        while (num <= n * n) {
            for (int i = colStart; i <= colEnd; i++) {
                result[rowStart][i] = num++;
            }
            rowStart++;

            for (int i = rowStart; i <= rowEnd; i++) {
                result[i][colEnd] = num++;
            }
            colEnd--;

            for (int i = colEnd; i >= colStart; i--) {
                result[rowEnd][i] = num++;
            }
            rowEnd--;

            for (int i = rowEnd; i >= rowStart; i--) {
                result[i][colStart] = num++;
            }
            colStart++;
        }

        return result;
    }
}