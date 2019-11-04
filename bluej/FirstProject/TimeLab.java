import java.util.Scanner;

public class TimeLab
{
    
    
    public static void main(String[] args){
         int loop_number = 1;
         while(loop_number == 1){
             Scanner kb = new Scanner(System.in);
             System.out.println("Enter a number of milliseconds you have to live:  ");
             String input = kb.nextLine();
             
         
             //System.out.println("The user entered:  " + input);
             int milsec1 = Integer.parseInt(input);
             
             int days = milsec1 / 86400000;
             int milsec2 = milsec1 % 86400000;
             int hours = milsec2 / 3600000;
             int milsec3 = milsec2 % 3600000;
             int minutes = milsec3 / 60000;
             int milsec4 = milsec3 % 60000;
             int seconds = milsec4 / 1000;
             int milsec5 = milsec4 % 1000;
             
             System.out.println("You have " + days + " days, " + hours + " hours, " 
             + minutes + " minutes, " + seconds + " seconds, and " + milsec5 + " milliseconds to live.");
             
         }
    }
    
}

