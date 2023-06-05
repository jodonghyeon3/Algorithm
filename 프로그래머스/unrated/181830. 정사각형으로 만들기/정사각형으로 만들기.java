import java.util.*;
class Solution {
    public int[][] solution(int[][] arr) {
    int maxRows = arr.length;
        int maxCols = arr[0].length;
        int maxLength = Math.max(maxRows, maxCols);

        for (int i = 0; i < maxRows; i++) {
            while (arr[i].length < maxLength) {
                int[] newRow = new int[arr[i].length + 1];
                System.arraycopy(arr[i], 0, newRow, 0, arr[i].length);
                newRow[arr[i].length] = 0;
                arr[i] = newRow;
            }
        }

        while (arr.length < maxLength) {
            int[] newRow = new int[maxLength];
            arr = Arrays.copyOf(arr, arr.length + 1);
            arr[arr.length - 1] = newRow;
        }

        return arr;
    }
}