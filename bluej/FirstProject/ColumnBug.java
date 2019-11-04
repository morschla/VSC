import info.gridworld.grid.Location;
import info.gridworld.actor.Bug;
import java.awt.Color;

public class ColumnBug extends Bug
{
   public ColumnBug(){
        setColor(Color.GREEN);
    }
    
   public void act(){
        if (canMove())
        {
            move();
           
        }
        else
        {
            turn();
            turn();
            turn();
            turn();
        }
    }
}