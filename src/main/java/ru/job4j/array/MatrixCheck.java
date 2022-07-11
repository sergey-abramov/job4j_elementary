package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = false;
        for (int i = 0; i < board.length - 1; i++) {
            if (board[row][i] == 'X') {
                result = true;
                break;
            }
        }
        return result;
    }
}
