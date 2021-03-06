package Chess;

public class Knight extends Piece {

    public Knight(boolean white) {
        super(white);
    }
    
    @Override
      public boolean MoveIsValid (Piece [][] board, Spot current_position , Spot new_position )
      {
          if(new_position.getPiece().isWhite()==this.isWhite())
          {
              return false; //they shouldn't be the same color
          }
          return (Math.abs(current_position.getX_position()-new_position.getX_position())*
                  Math.abs(current_position.getY_position()-new_position.getY_position())==2);
      }
    
}
