import java.awt.*;

class Butterfly extends Critter{
    private int moves;
    private Color color;
    
    public Butterfly() { //constructor
        color = Color.YELLOW;
    }
    
    
    public Direction getMove() 
    {
        if (moves == 0) {
            moves++;
            return Direction.NORTH;
        }
        else if (moves == 1) {
            moves++;
            return Direction.WEST;
        }
        else if (moves == 2) {
            moves++;
            return Direction.NORTH;
        }
        else if (moves == 3) {
            moves = 0;
            return Direction.EAST;
        }else{
            return Direction.CENTER;
        }
    }
    
    public String toString() {
        if (moves == 0) {
            return "x";
        }
        else {
            return "-";
        }
    }
}