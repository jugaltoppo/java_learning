public class PerfectNumber
{
    public static void main(String args[])
    {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(-28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }
    public static boolean isPerfectNumber(int number)
    {
        if (number<1)
        {
            return false;
        }
        int a=number;
        int sum=0;
        while(number>=2)
        {
            number--;
            int value=a%number;
            if (value==0)
            {
                sum=sum+number;
            }

        }
        if (sum==a)
        {
            return true;
        }
        return false;




    }

}
