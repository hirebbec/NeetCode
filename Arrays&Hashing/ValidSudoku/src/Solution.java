import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        List<Character> characters = new ArrayList<>();
        for (int i = 0; i < 9; ++i) {
            characters.clear();
            for (int j = 0; j < 9; ++j) {
                characters.add(board[i][j]);
            }
            if (!check(characters))
                return false;
        }
        for (int i = 0; i < 9; ++i) {
            characters.clear();
            for (int j = 0; j < 9; ++j) {
                characters.add(board[j][i]);
            }
            if (!check(characters))
                return false;
        }
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                characters.clear();
                characters.add(board[3 * i][3 * j]);
                characters.add(board[3 * i][3 * j + 1]);
                characters.add(board[3 * i][3 * j + 2]);
                characters.add(board[3 * i + 1][3 * j]);
                characters.add(board[3 * i + 1][3 * j + 1]);
                characters.add(board[3 * i + 1][3 * j + 2]);
                characters.add(board[3 * i + 2][3 * j]);
                characters.add(board[3 * i + 2][3 * j + 1]);
                characters.add(board[3 * i + 2][3 * j + 2]);
                if (!check(characters))
                    return false;
            }
        }
        return true;
    }

    private boolean check(List<Character> characters) {
        int[] m = new int[9];
        for (char c : characters) {
            if (c == '.')
                continue;
            if (m[c - 49] > 0) {
                System.out.println(characters);
                return false;
            }
            m[c - 49]++;
        }
        return true;
    }
}