import java.util.List;

public class Game {

    private Player p1;
    private Player p2;
    private Player turn;
    private Board board;
    private List<Move> moveList;



    public Game(Player p1, Player p2) {
        this.board = new Board();
        this.turn = new Player();
        this.p1 = p1;
        this.p2 = p2;
    }

    public void start() {
        // who's turn, white or black;
        this.turn = new Player();
        if (p1.getIsWhite()) {
            turn = p1;
        } else {
            turn = p2;
        }
        while(true) {
            // player gives a move, move the piece to new box;
                // can move?
                // valid move?
                // what is happend if valid move, change piece status;
            // if win: break loop

            this.playerMakeMove(turn, startX, startY, endX, endY);




            // take turns;
            if (turn == p1) {
                turn = p2;
            }
        }

    }

    public void playerMakeMove(Player turn, int startX, int startY, int endX, int endY)  {
        Box startBox = getBox(startX, startY);
        Box endBox = getBox(endX, endY);

        String result = makeMove(turn, startBox, endBox);

        switch(result) :
        case "invalid start": break;
        case "invalid end": break;
        case "invalid player": break;
        case "invalid move": break;
        case "white Win": break;
        case "black Win": break;
        defualt :
        System.out.println("move successfully, next turn"); break;



    }

    public String makeMove(Player turn, Box startBox, Box endBox) {
        // conner case:
        if (startBox == null) {
             return "invalid start";
        }

        if (turn.getIsWhite() != this.turn.getIsWhite()) {
            return "invalid palyer";
        }

        if (startBox.getPiece().makeMove()) {

        } else {
            return "invalid move";
        }

        if (endBox != null ) {

        } else {
            endBox = startBox;
            moveList.add(new Move(turn, startBox, endBox));
        }
    }
}
