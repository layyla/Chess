public class Rook extends Piece {
    
    @Override
    public boolean MoveIsValid (Spot current_position , Spot new_position) {
        // checK if new position is valid 
        if (current_position.getX_position() != new_position.getX_position() && 
            current_position.getY_position() != new_position.getY_position()   ) {
            
            return false;        
        }
        // check if new position is not equal to the current_position
        else if (current_position.getX_position() == new_position.getX_position() && 
                 current_position.getY_position() == new_position.getY_position()   ) {
        
            return false;             
        }
        // check if there is no pieces blocking the way from current position to new position
        else if (current_position.getX_position() != new_position.getX_position()) {
            int y = current_position.getY_position();
            if (new_position.getX_position() > current_position.getX_position()) {
                for (int i = current_position.getX_position() ; i < new_position.getX_position() ; i++) {
                    // board is class unfinished 
                    // getSpot method returns spot in the board with coordinates x & y
                    if (Board.getSpot(i , y).getPiece() != null) {
                        return false;
                    }
                }
            }
            else {
                for (int i = current_position.getX_position() ; i > new_position.getX_position() ; i--) {
                    // board is class unfinished 
                    // getSpot method returns spot in the board with coordinates x & y
                    if (Board.getSpot(i , y).getPiece() != null) {
                        return false;
                    }
                }
            }
            if (new_position.getPiece() != null) {
                if (new_position.getPiece().isWhite() == this.isWhite()) {
                    return false;
                }
            }
        }
        else if (current_position.getY_position() != new_position.getY_position()) {
            int x = current_position.getX_position();
            if (new_position.getY_position() > current_position.getY_position()) {
                for (int j = current_position.getY_position() ; j < new_position.getY_position() ; j++) {
                    // board is class unfinished 
                    // getSpot method returns spot in the board with coordinates x & y
                    if (Board.getSpot(x , j).getPiece() != null) {
                        return false;
                    }
                }
            }
            else {
                for (int j = current_position.getY_position() ; j > new_position.getY_position() ; j--) {
                    // board is class unfinished 
                    // getSpot method returns spot in the board with coordinates x & y
                    if (Board.getSpot(x , j).getPiece() != null) {
                        return false;
                    }
                }
            }
            if (new_position.getPiece() != null) {
                if (new_position.getPiece().isWhite() == this.isWhite()) {
                    return false;
                }
            }
        }
        // check if new position is outside the board
        else if (new_position.getX_position() >= 8 || new_position.getX_position() < 0 ||
                 new_position.getY_position() >= 8 || new_position.getX_position() < 0) {
            
            return false;
        }
        else {
            return true;
        }
    }
    
    // subclass constructor
    public Rook (boolean white) {
        super(white);
    }
}