
public class Rook extends Piece {

    public Rook(boolean white) {
        super(white);
    }

    @Override
    public boolean MoveIsValid(Piece[][] board, Spot current_position, Spot new_position) {
       // TODO Auto-generated method stub
		
		//System.out.println("currentRow: " + currentRow + " currentCol: " + currentCol + " newRow: " + newRow + " newCol: " + newCol);
		
		if(current_position.getX_position() != new_position.getX_position() && current_position.getY_position() != new_position.getY_position()){
			//Did not move along one rank/file
			return false;
		}
		
		//First I will assumed the Rook is moving along the rows.
		int offset;
		
		if(current_position.getX_position() != new_position.getX_position()){
			if(current_position.getX_position() < new_position.getX_position()){
				offset = 1;
			}else{
				offset = -1;
			}
			
			for(int x = current_position.getX_position() + offset; x != new_position.getX_position(); x += offset){
				//Go from currentRow to newRow, and check every space
				if(board[x][current_position.getY_position()] != null){
					//System.out.println("1 " + x);
					return false;
				}
			}
		}
	
		//Now do the same for columns
		if(current_position.getY_position() != new_position.getY_position()){
			if(current_position.getY_position() < new_position.getY_position()){
				offset = 1;
			}else{
				offset = -1;
			}
			
			for(int x = current_position.getY_position() + offset; x != new_position.getY_position(); x += offset){
				//Go from currentCol to newCol, and check every space
				if(board[current_position.getX_position()][x] != null){
					//System.out.println("2");
					return false;
				}
			}
		}
		
		return true; 
    }
}
