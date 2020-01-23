public class LargestPrime
{
    public static void main(String args[])
    {
        System.out.println(getLargestPrime(45 ));
//        System.out.println(getLargestPrime(21));
//        System.out.println(getLargestPrime(217));
//        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(7 ));
    }
    public static int getLargestPrime(int number)
    {
        int j=0;
        int i=0;
        int a=0;
        if(number<2)
        {
            return -1;
        }
        a=number;
        for(i=2;i<=a;i++)
        {

            if(number%i==0)//i=3
            {
                while(number%i==0)
                {
                    number=number/i;

                }
                if(number==1)
                {
                    return i;
                }
            }

        }

        return -1;
    }
}
