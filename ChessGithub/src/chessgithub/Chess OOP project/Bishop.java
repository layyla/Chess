package chess;


public class Bishop extends Piece{
    public Bishop (boolean white)
    {
        super(white);
        
    }

    @Override
    public boolean MoveIsValid(Piece[][] board,Spot current_position, Spot new_position) {
       
       if (new_position.getPiece().isWhite() == this.isWhite())
           return false ;
       
       
       else if(current_position.getX_position()== new_position.getX_position()||current_position.getY_position()== new_position.getY_position())
           return false ;
            
       //didnt move at all 
       
       
       int x = Math.abs(current_position.getX_position() - new_position.getX_position()); 
       
       int y = Math.abs(current_position.getY_position() - new_position.getY_position()); 
       
       if(x!=y)
            return false ;
       
       
       int row_move,col_move;
        
       if(current_position.getX_position()<new_position.getX_position())
        {
            row_move=1;
        }
        else
        { 
            row_move=-1;
        }
         if(current_position.getY_position()<new_position.getY_position())
        {
            col_move=1;
        }
        else {
            col_move=-1;
         }
           int move_on_y = current_position.getY_position() + col_move;
		for(int move_on_x = current_position.getX_position() + row_move; x !=new_position.getX_position() ; x += row_move)
                {
			
			if(board[move_on_x][move_on_y] != null)
                        {
				return false;
			}
			
			move_on_y += col_move;
		}
		return true;
         
        
            
        
        
        
        
    }

   
    
    
    
}
