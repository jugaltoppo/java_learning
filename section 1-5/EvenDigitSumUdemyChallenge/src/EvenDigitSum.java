public class EvenDigitSum
{
    public static void main(String args[])
    {
        System.out.println(getEvenDigitSum(-22));
    }
    public static int getEvenDigitSum(int number)
    {
        int sum=0;
        int value=0;
        if (number<0)
        {
            return -1;
        }
        while(number!=0)
        {
            value=number%10;
            if (number%2==0)
            {
                sum= sum + value;
            }
            number = number/10;
        }
        return sum;
    }
}
