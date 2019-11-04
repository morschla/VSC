
public class MathHelperProb2
{
    public static int sumOfEven(int limit){
        int sum = 0;
        int prevNum = 1;
        int num = 2;
        int num2 = 2;
        while(num <= limit){
            num2 = num;
            if(num % 2 == 0){
                sum += num;
            }
            num += prevNum;
            prevNum = num2;
        }
        return sum;
    }
}
