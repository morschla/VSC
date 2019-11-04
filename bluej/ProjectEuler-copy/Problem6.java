

public class Problem6
{
    public static void main(String[] args){
        int sumOfSquares = MathHelper.sumOfSquares(100);
        int sum = MathHelper.sumUpTo(100);
        System.out.println(sum * sum - sumOfSquares);
    }
}
