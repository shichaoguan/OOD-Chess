public class Box {
    private Piece piece;
    private int x;
    private int y;

    public Box(Piece piece, int x, int y) {
        this.piece = piece;
        this.x = x;
        this.y = y;
    }

    public Piece getPiece() {
        return this.piece;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
