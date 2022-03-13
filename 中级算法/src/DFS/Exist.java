package DFS;

/**
 * @description: 单词搜索
 * @create: 2020-08-23-21:52
 * @author: Hey
 */
public class Exist {
    public static void main(String[] args) {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };

        String word = "ABCCE";
        Exist exist = new Exist();
        boolean res = exist.exist(board, word);
        System.out.println(res);
    }

    private boolean[][] marked;
    private int[][] directions = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    private int rows;
    private int cols;
    private char[][] board;
    private String word;

    public boolean exist(char[][] board, String word) {
        rows = board.length;
        cols = board[0].length;
        /*if (rows == 0) {
            return false;
        }*/
        marked = new boolean[rows][cols];
        this.word = word;
        this.board = board;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (dfs(i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(int i, int j, int start) {
        if (start == word.length() - 1) {
            return board[i][j] == word.charAt(start);
        }
        if (board[i][j] == word.charAt(start)) {
            marked[i][j] = true;
            for (int k = 0; k < 4; k++) {
                int newX = i + directions[k][0];
                int newY = j + directions[k][1];
                if (inArea(newX, newY) && !marked[newX][newY]) {
                    if (dfs(newX, newY, start + 1)) {
                        return true;
                    }
                }
            }
            // marked[i][j] = false;
        }
        return false;
    }

    private boolean inArea(int x, int y) {
        return x >= 0 && x < rows && y >= 0 && y < cols;
    }
}
