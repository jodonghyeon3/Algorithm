import java.util.Stack;

class Solution {
    public static int solution(int[][] board, int[] moves) {
        Stack<Integer> a = new Stack<>();
        a.add(101);
        int cnt = 0;
        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][moves[i] - 1] >= 1) {
                    if (a.peek() == board[j][moves[i] - 1]) {
                        a.pop();
                        cnt += 2;
                    } else {
                        a.add(board[j][moves[i] - 1]);
                    }
                    board[j][moves[i] - 1] = 0;
                    break;

                }
            }
        }

        return cnt;
    }
}