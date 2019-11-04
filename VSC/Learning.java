import java.util.Scanner;

public class Learning{
    public static void main(String[] args) {
        
        Scanner kboard = new Scanner(System.in);
        System.out.print("Enter a number:   ");
        int choice = Integer.parseInt(kboard.nextLine());
        /*if(choice == 1 || choice == 2){

        }*/
        switch(choice){
            case 1:
            case 2:
            System.out.println("Buckle my shoe");
            break;
            case 3:
            case 4:
            System.out.println("Shut the door");
            break;



            default:
            System.out.println("That is not a valid");
        }

    }
}