class Solution {
    public int solution(int[][] board) {
        int[][] boardDP = new int[board.length + 1][board[0].length + 1];
    
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    isBomb(boardDP, i, j);
                }
            }
        }

        int answer = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(boardDP[i][j] == 0) {
                    answer++;
                }
            }
        }

        return answer;
    }
    
    public void isBomb(int[][] boardDP, int x, int y) {
        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {
                if (i >= 0 && j >= 0 && i < boardDP.length && j < boardDP[0].length) {
                    boardDP[i][j] = 1;
                }
            }
        }
    }
}
