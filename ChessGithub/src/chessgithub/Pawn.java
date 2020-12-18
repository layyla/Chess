package chessgithub;

public class Pawn extends Piece {

    public Pawn(boolean white) {
        super(white);
    }

    @Override
    public boolean MoveIsValid(Spot current_position , Spot new_position ){

        //to calculate the absolute difference between the new position and the current position
        int x = Math.abs(new_position.getX_position() - current_position.getX_position());
        int y = Math.abs(new_position.getY_position() - current_position.getY_position());



        //this is the condition to check the validity if the new position have a piece of the same color
        if(new_position.getPiece().isWhite() == this.isWhite()){
            return false;
        }

        //this is the condition to check the validity of the normal move which is one step
        if(x + y == 1){
            return true;
        }

        //this is the condition to check the validity of the first move which is two steps
        if (current_position.getX_position()==1 && x == 2){
            return  true ;
        }


        //this the condition to check the validity of the catch movement.

        if (x ==1 & y == 1  && new_position.getPiece().isWhite() != this.isWhite() ){
            return true;
        }




       return false;


    }


}
