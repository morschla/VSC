import info.gridworld.grid.Location;
import info.gridworld.actor.Bug;
import java.awt.Color;

public class SpinnyBug extends Bug
{
    public SpinnyBug(){
        setColor(Color.GREEN);
    }
    
    public void act(){
        
        setDirection(getDirection() + Location.HALF_LEFT);
    }
}
