package chessgithub;

public class King extends Piece{

    public King(boolean white) {
        super(white);
    }

    @Override
    public boolean MoveIsValid(Spot current_position, Spot new_position) {
                  // checK if new position is valid
        return (((Math.abs(current_position.getX_position() - new_position.getX_position()) == 1) 
                //check if the new position is out of bounds
                && (current_position.getX_position() > 0 && current_position.getX_position() < 7))
                // checK if new position is valid
                || ((Math.abs(current_position.getY_position() - new_position.getY_position()) == 1)
                //check if the new position is out of bounds
                && (current_position.getY_position() > 0 && current_position.getY_position() < 7)))
                //check if there is a piece of same color in the new position
                && (this.isWhite() != new_position.getPiece().isWhite());
    }
    
}