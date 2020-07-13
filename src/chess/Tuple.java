package chess;

/**
 * Used to store an int/int pair to map to tiles on the chessboard.
 */
public class Tuple {
    private final int x;
    private final int y;

    public Tuple(int x, int y){
            this.x = x;
            this.y =y;
    }
    

    public int X(){
        return x;
    }

    public int Y(){
        return y;
    }
    
    
    
    
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        if(obj instanceof Tuple)
        {
        	Tuple temp = (Tuple) obj;
            if(this.x == temp.x && this.y== temp.y)
                return true;
        }
        return false;

    }
    

}
