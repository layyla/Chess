package chess;

public class Spot {
    private Piece piece;
    private int x_position;
    private  int y_position ;

    public Spot(Piece piece, int x_position, int y_position) {
        this.piece = piece;
        this.x_position = x_position;
        this.y_position = y_position;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public int getX_position() {
        return x_position;
    }

    public void setX_position(int x_position) {
        this.x_position = x_position;
    }

    public int getY_position() {
        return y_position;
    }

    public void setY_position(int y_position) {
        this.y_position = y_position;
    }
}

