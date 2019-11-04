
public class MathHelper
{
    public static int sumOfSquares(int limit){
        int sum1 = 0;
        for(int num = 1; num <= limit; num++){
            sum1 += num * num;
        }
        return sum1;
    }

    public static int sumUpTo(int limit){
        int sum2 = 0;
        for(int num = 1; num <= limit; num++){
            sum2 += num;
        }
        return sum2;
    }

    public static int sumOfMultiples3(int limit){
        int sum3  = 0;

        for(int num = 1; num < limit; num++){
            if(num % 5 == 0){
                sum3 += num;
            }
        }
        return sum3;
    }
    
    public static int sumOfMultiples5(int limit){
        int sum3  = 0;

        for(int num = 1; num < limit; num++){
            if(num % 3 == 0){
                sum3 += num;
            }
        }
        return sum3;
    }
    
    public static int sumOfMultiples3And5(int limit){
        int sum4  = 0;

        for(int num = 1; num < limit; num++){
            if(num % 3 == 0 && num % 5 == 0){
                sum4 += num;
            }
        }
        return sum4;
    }
}
