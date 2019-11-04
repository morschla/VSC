import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Day1{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner file = new Scanner(new File("2015/inputs/Day1.txt"));
        String line = file.nextLine();
        System.out.println(line.charAt(0));

        int floor = 0;
        int position = 0;
        int positionAmount = 0;
        for(int i= 0; i < line.length(); i++){
            char current = line.charAt(i);
            position++;
            
            if(current == '('){
                floor++;
                
            }else{
                floor--;
                
            }
            if(positionAmount == 0){
                if(floor == -1){
                    
                    System.out.println(position);
                    positionAmount++;
                }
                
            }
            
        }
        System.out.println(floor);
        file.close();

    }
}