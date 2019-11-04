import info.gridworld.grid.Location;
import info.gridworld.actor.Bug;
import java.awt.Color;

public class RainbowBug extends Bug
{
    String RanColor = "BLUE";
    
    
    public void turn(){
        
        setDirection(getDirection() + Location.HALF_LEFT);
    }
    public void act(){
        if (canMove())
            move();
        else
            turn();
        
        setColor(Color.BLUE);
    }
}