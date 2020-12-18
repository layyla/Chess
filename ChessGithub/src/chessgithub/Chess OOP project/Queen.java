
public class Queen extends Piece {

    public Queen(boolean white) {
        super(white);
    }

    @Override
    public boolean MoveIsValid(Piece[][] board, Spot current_position, Spot new_position) {
     //A Queen's move is the same as a Rook's or a Bishop's
		return new Rook(white).MoveIsValid(board, current_position, new_position) || new Bishop(white).MoveIsValid(board, current_position, new_position);   
    }

    
    } 

        

    

