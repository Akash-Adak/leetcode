import java.util.Arrays;

class Solution {
    int[] row = {-1, 1, 0, 0, -1, -1, 1, 1};
    int[] col = {0, 0, -1, 1, -1, 1, 1, -1};

    int foundNeighbour(int[][] mat, int i, int j) {
        int count = 0;
        for (int k = 0; k < 8; k++) {
            int ni = i + row[k];
            int nj = j + col[k];

            // Ensure indices are within bounds
            if (ni >= 0 && nj >= 0 && ni < mat.length && nj < mat[0].length) {
                if (mat[ni][nj] == 1) count++;
            }
        }
        return count;
    }

    public void gameOfLife(int[][] board) {
        boolean[][] dl = new boolean[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            Arrays.fill(dl[i], false);
        }

        // Determine future state
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int find = foundNeighbour(board, i, j);
                
                if (board[i][j] == 0 && find == 3) {
                    dl[i][j] = true;  // Revives cell
                } else if (board[i][j] == 1 && (find == 2 || find == 3)) {
                    dl[i][j] = true;  // Keeps alive
                }
            }
        }

        // Update board in-place
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = dl[i][j] ? 1 : 0;
            }
        }
    }
}
