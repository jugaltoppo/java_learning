public class FirstLastDigitSum
{
    public static void main(String args[])
    {
        System.out.println(sumFirstAndLastDigit(0));
    }
    public static int sumFirstAndLastDigit(int number)
    {
        int sum=0;
        int count=0;
        int firstvalue=0;
        int lastvalue=0;
        if(number< 0)
        {
            return -1;

        }
        else
        {
            while(number!=0)
            {
                firstvalue=number%10;

                number = number/10;
                count++;
                if(count==1)
                {
                    lastvalue=firstvalue;
                }

            }
            sum=firstvalue+lastvalue;
            return sum;
        }




    }
}
