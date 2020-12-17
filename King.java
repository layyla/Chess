package chess;

public class King extends Piece{

    public King(boolean white) {
        super(white);
    }

    @Override
    public boolean MoveIsValid(Spot current_position, Spot new_position) {
        return (((Math.abs(current_position.getX_position() - new_position.getX_position()) == 1) 
                && (current_position.getX_position() > 0 && current_position.getX_position() < 7))
                || ((Math.abs(current_position.getY_position() - new_position.getY_position()) == 1)
                && (current_position.getY_position() > 0 && current_position.getY_position() < 7)))
                && (current_position.getPiece().isWhite() != new_position.getPiece().isWhite());
    }
    
}
