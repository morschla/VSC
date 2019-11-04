import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Day2{
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner file = new Scanner(new File("2015/inputs/Day2.txt"));
        int areaOfPresent = 0;
        
        int lengthOfRibbon = 0;
        while(file.hasNextLine()){
            String line = file.nextLine();
            
            int x1 = line.indexOf("x");
            int x2 = line.lastIndexOf("x");

            int l = Integer.parseInt(line.substring(0, x1));
            int w = Integer.parseInt(line.substring(x1 + 1, x2));
            int h = Integer.parseInt(line.substring(x2 + 1));

            int topSide = l * w;
            int frontSide = l * h;
            int rightSide = h * w;
            int extraSide = Math.min(Math.min(topSide, rightSide) , Math.min(topSide, frontSide));
            
            int topPerimeter = (2 * l) + (2 * w);
            int frontPerimeter = (2 * l) + (2 * h);
            int rightPerimeter = (2 * h) + (2 * w);
            int smallestPerimeter = Math.min(Math.min(topPerimeter, rightPerimeter) , Math.min(topPerimeter, frontPerimeter));
            int lengthOfBow = l * h * w;
            lengthOfRibbon += lengthOfBow + smallestPerimeter;

            areaOfPresent += ((2 * topSide) + (2 * frontSide) + (2 * rightSide) + extraSide);

        }
        
        System.out.println(areaOfPresent);
        System.out.println(lengthOfRibbon);
    }
}