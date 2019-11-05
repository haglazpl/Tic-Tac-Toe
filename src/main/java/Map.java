public class Map {

    private int MAX_COLS = 3;
    private int MAX_ROWS = 3;
    private char[][] board = new char[MAX_ROWS][MAX_COLS];

    public int getMAX_COLS() {
        return MAX_COLS;
    }

    public void setMAX_COLS(int MAX_COLS) {
        this.MAX_COLS = MAX_COLS;
    }

    public int getMAX_ROWS() {
        return MAX_ROWS;
    }

    public void setMAX_ROWS(int MAX_ROWS) {
        this.MAX_ROWS = MAX_ROWS;
    }

    public char[][] getBoard() {
        return board;
    }

    public boolean isFull(int row, int col) {
        if (board[row][col] == 'X' ||
                board[row][col] == 'O') {
            return true;
        }
        return false;
    }

    public void initBoard(){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = '.';
            }
        }

    }
}
