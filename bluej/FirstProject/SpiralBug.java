import info.gridworld.grid.Location;
import info.gridworld.actor.Bug;
import java.awt.Color;


public class SpiralBug extends Bug
{
    //Fields -- Attribute data
    //access type variable name
    //private int sideLength, segment, steps;
    private int sideLength;
    private int segment;
    private int steps;
    

    //Constructor -- same name as class
    //Used to initialize fields
    
    public SpiralBug(){
        sideLength = 1;
        segment = 0;
        steps = 0;
    }
    
    
    public void act(){
        if(steps < sideLength){
            move();
            steps++;
        }else{
            turn();
            turn();
            segment++;
            steps = 0;
            if(segment == 2){
                sideLength++;
                segment = 0;
                
            }
        }
    }
}
