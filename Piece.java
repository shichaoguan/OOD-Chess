public abstract class Piece {
    private boolean isKilled = false;
    private boolean isWhited = false; // which player

    public Piece(boolean isWhited) {
        this.isWhited = isWhited;
    }

    public void setKilled(boolean isKilled) {
        this.isKilled = isKilled;
    }

    public boolean getIsWhited() {
        return this.isWhited;
    }

    public boolean getIsKilled() {
        return this.isKilled;
    }


    public abstract boolean makeMove();
}
