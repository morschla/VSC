

public class Problem1
{
    public static void main(String[] args){
        int sumOfMultiples3 = MathHelper.sumOfMultiples3(1000);
        int sumOfMultiples5 = MathHelper.sumOfMultiples5(1000);
        int sumOfMultiples3And5 = MathHelper.sumOfMultiples3And5(1000);
        System.out.println(sumOfMultiples5 + sumOfMultiples3 - sumOfMultiples3And5);
    }
}
