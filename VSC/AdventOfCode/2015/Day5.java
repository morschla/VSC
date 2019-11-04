import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Day5{
    
    public static void main(String[] args) throws FileNotFoundException{
        Scanner file = new Scanner(new File("2015/inputs/Day5.txt"));
        String line = file.nextLine();

        String str = "suerykkeptdsutidb";
        System.out.println(hasThreeVowels(str));
        System.out.println(hasDoubleLetter(str));
        System.out.println(containsIllegalSequence(str));
        System.out.println(isNice(str));
        System.out.println(amountOfNiceDays(line));
    }
    static int niceCounter = 0;

    public Day5(){
        
    }

    public static boolean isNice(String string) {
        return hasThreeVowels(string) && hasDoubleLetter(string) && !containsIllegalSequence(string);
	}

   
    public static boolean isVowel(char letter){
        if("aeiou".indexOf(letter) == 1){
            return false;
        }else{
            return true;
        }
        //return "aeiou".indexOf(letter) != -1;
        //return letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || 
    }
    public static boolean hasThreeVowels(String string){

        int count = 0;
        
        for(int i = 0; i < string.length(); i++){
            char c = string.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c== 'o' || c == 'u'){
                count++;
            }
        }
        if(count >= 3){
            return true;
        }else{
            return false;
        }
    }
    public static boolean hasDoubleLetter(String string){

        int num = 0;
        for(int i = 0; i < string.length(); i++){
            if(i == 0){
                char c = string.charAt(i);
            }else{
                char c = string.charAt(i);
                char preC = string.charAt(i-1);
                if(c == preC){
                    num++;
                }
            }
        }
        if(num >= 1){
            return true;
        }else{
            return false;
        }

    }
    public static boolean containsIllegalSequence(String string){
        int count = 0;
        for(int i = 0; i < string.length(); i++){
            if(i == 0){
                char c = string.charAt(i);
            }else{
                char c = string.charAt(i);
                char preC = string.charAt(i-1);
                if((preC == 'a' && c == 'b') || (preC == 'c' && c == 'd') || (preC == 'p' && c == 'q') || (preC == 'x' && c == 'y')){
                    count++;
                }
            }
        }
        if(count >= 1){
            return true;
        }else{
            return false;
        }
    }
    public static int amountOfNiceDays(String string){
        if(isNice(string) == true){
            niceCounter++;
        }
		return niceCounter;
    }
}