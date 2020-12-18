package chessgithub;

public abstract class Piece {

    private boolean eaten  = false;
    private boolean white = false ;

    public Piece(boolean white) {
        this.white = white;
    }

    public boolean isEaten() {
        return eaten;
    }

    public void setEaten(boolean eaten) {
        this.eaten = eaten;
    }

    public boolean isWhite() {
        return white;
    }

    public void setWhite(boolean white) {
        this.white = white;
    }
    
    

    public abstract boolean MoveIsValid (Spot current_position , Spot new_position );

}
