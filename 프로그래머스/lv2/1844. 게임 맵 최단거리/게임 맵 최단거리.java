import java.util.*;
class Solution {
     private static final int[][] DIRECTIONS = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;

        
        if (maps[0][0] == 0 || maps[n - 1][m - 1] == 0) {
            return -1;
        }

        
        boolean[][] visited = new boolean[n][m];

        
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0, 1}); 

        while (!queue.isEmpty()) {
            int[] position = queue.poll();
            int row = position[0];
            int col = position[1];
            int distance = position[2];

            
            if (row == n - 1 && col == m - 1) {
                return distance;
            }

            visited[row][col] = true;

            for (int[] dir : DIRECTIONS) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];

                if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < m && maps[newRow][newCol] == 1 && !visited[newRow][newCol]) {
                    queue.offer(new int[]{newRow, newCol, distance + 1});
                    visited[newRow][newCol] = true;
                }
            }
        }

        return -1;
    }
}