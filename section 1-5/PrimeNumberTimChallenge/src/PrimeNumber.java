public class PrimeNumber
{
    public static void main(String Args[])
    {
        System.out.println( isPrime(2));
        System.out.println( isPrime(3));
        System.out.println( isPrime(5));
        System.out.println( isPrime(7));
        System.out.println( isPrime(11));
        System.out.println( isPrime(4));
        System.out.println( isPrime(-1));

        int count = 0;
        for (int i=10;i<=50; i++)
        {
            if(isPrime(i))
            {
                System.out.println("number " + i + " is a prime no");
                count ++;

            }
            if (count==3)
            {
                System.out.println("exiting for loop");
                break;
            }
        }
    }
    public static boolean isPrime(int n)
    {
       if (n<0 || (n==1 || n==0) )
       {
           return false;
       }
       else
       {
           for (int i=2;i<=n/2;i++)
           {
               if (n%i==0)
               {
                   return false;
               }

           }
           return true;

       }

    }

}
