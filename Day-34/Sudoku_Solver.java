class Solution {
    public void solveSudoku(char[][] board) {
        ans(board, 0, 0);
    }

    public boolean ans(char[][] board, int i, int j) {
        if (i == board.length) {
            return true;
        }
        int ni = (j == board[0].length - 1) ? i + 1 : i;
        int nj = (j == board[0].length - 1) ? 0 : j + 1;
        if (board[i][j] != '.') {
            return ans(board, ni, nj);
        }
        for (char ch = '1'; ch <= '9'; ch++) {
            if (isValid(board, i, j, ch)) {
                board[i][j] = ch;
                if (ans(board, ni, nj))
                    return true;
                board[i][j] = '.';
            }
        }
        return false;
    }

    public boolean isValid(char[][] board, int i, int j, char ch) {
        for (int k = 0; k < board.length; k++) {
            if (board[k][j] == ch) {
                return false;
            }
        }
        for (int k = 0; k < board[0].length; k++) {
            if (board[i][k] == ch) {
                return false;
            }
        }
        int rowStart = (i / 3) * 3;
        int colStart = (j / 3) * 3;
        for (int ci = rowStart; ci < rowStart + 3; ci++) {
            for (int cj = colStart; cj < colStart + 3; cj++) {
                if (board[ci][cj] == ch) {
                    return false;
                }
            }
        }
        return true;
    }
}