
import java.util.Scanner;
public class CalculatorLab
{
    public static void main(String[] args){
        int loop_num = 1;
        char decision;
        Scanner kb = new Scanner(System.in);

        do{

            
            System.out.println("Enter a number:  ");
            int num1 = Integer.parseInt(kb.nextLine());

            System.out.println("Enter an operator:  ");
            char operator = kb.nextLine().charAt(0);

            System.out.println("Enter a number:  ");
            int num2 = Integer.parseInt(kb.nextLine());

            if(operator == '+'){
                int num = num1 + num2;
                System.out.println(num1 + " " + operator + " " + num2 + " = " + num);
            }else if(operator == '-'){
                int num = num1 - num2;
                System.out.println(num1 + " " + operator + " " + num2 + " = " + num);
            }else if(operator == '*'){
                int num = num1 * num2;
                System.out.println(num1 + " " + operator + " " + num2 + " = " + num);
            }else if(operator == '/'){
                int num = num1 / num2;
                System.out.println(num1 + " " + operator + " " + num2 + " = " + num);
            }else if(operator == '%'){
                int num = num1 % num2;
                System.out.println(num1 + " " + operator + " " + num2 + " = " + num);
            }
            else if(operator == '^'){
                int expNum = 1;
                int num = num1;
                while(expNum < num2){
                    num = num * num1;
                    expNum++;
                }
                System.out.println(num1 + " " + operator + " " + num2 + " = " + num);
            }
            System.out.print("would you like to do another calculation? ");
            decision = kb.nextLine().charAt(0);

        }while(decision == 'y');
    }
}
