public class Board {
    private Box[][] board;

    public Board() {
        resetBoard();
    }

    private void resetBoard() {
        System.out.println("Resetting a chess board...");
        this.board = new Box[8][8];
        this.board[0][0] = new Box(new Rook(false),0, 0);
        this.board[0][7] = new Box(new Rook(false), 0, 7);
        this.board[7][0] = new Box(new Rook(true), 7, 0);
        this.board[7][7] = new Box(new Rook(true), 7, 7);

        this.board[0][1] = new Box(new Knight(false), 0, 1);
        this.board[0][6] = new Box(new Knight(false), 0, 6);
        this.board[7][1] = new Box(new Knight(true), 7, 1);
        this.board[7][6] = new Box(new Knight(true), 7, 6);

        this.board[0][1] = new Box(new Knight(false), 0, 1);
        this.board[0][6] = new Box(new Knight(false), 0, 6);
        this.board[7][1] = new Box(new Knight(true), 7, 1);
        this.board[7][6] = new Box(new Knight(true), 7, 6);

        this.board[0][2] = new Box(new Bishop(false), 0, 2);
        this.board[0][5] = new Box(new Bishop(false), 0, 5);
        this.board[7][2] = new Box(new Bishop(true), 7, 2);
        this.board[7][5] = new Box(new Bishop(true), 7, 5);

        this.board[0][3] = new Box(new Queen(false), 0, 3);
        this.board[0][4] = new Box(new King(false), 0, 4);
        this.board[7][3] = new Box(new King(true), 7, 3);
        this.board[7][4] = new Box(new Queen(true), 7, 4);

        for (int i = 0; i < 8; i++) {
            this.board[1][i] = new Box(new Pawn(false), 1, i);
            this.board[6][i] = new Box(new Pawn(true), 7, i);
        }

        for (int row = 2; row <= 5; row++) {
            for (int col = 0; col <= 7; col++) {
                this.board[row][col] = new Box(null, row, col);
            }
        }
    }


}
