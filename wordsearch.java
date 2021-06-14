import java.util.*;


class wordsearch {
    public boolean exist(char[][] board, String word) {
      int n = board.length; // row length
      int m = board[0].length; // column length

      for (int i=0; i < n; i++) {
        for (int j=0; j < m; j++) {
          if (isFound(i, j, board, word, 0)) {
            return true;
          }
        }
      }
      return false;
    }
    private boolean isFound(int i, int j, char[][] board, String word, int index) {
      if (index == word.length()) {
        return true;
      }
      if (i < 0 || j < 0 || i >= board.length || j >= board[0].length) {
        return false;
      }
      if (word.charAt(index) != board[i][j]) {
        return false;
      }
      char temp = board[i][j];
      board[i][j] = '*';
      if (isFound(i + 1, j, board, word, index + 1) ||
          isFound(i - 1, j, board, word, index + 1) ||
          isFound(i, j + 1, board, word, index + 1) ||
          isFound(i, j - 1, board, word, index + 1)
          ) {
            return true;
          }
      return false;
    }




public static void main(String[] args) {
    Solution test = new Solution();
    char[][] testlist = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
    System.out.println(test.exist(testlist, "ABCCED"));
  }
}

