public class SharedDigit
{
    public static void main(String args[])
    {
        System.out.println(hasSharedDigit(12,11));
    }
    public static boolean hasSharedDigit(int num1,int num2)
    {

        if((num1 <=9 || num1>=100) || (num2<=9 || num2>=100))
        {
            return false;
        }
        int a=num1;
        while (a !=0)
        {
            int num1value=a%10;
            int b=num2;

            while(b !=0)
            {

                int num2value=b%10;
                if (num1value==num2value)
                {

                    return true;
                }
                b=b/10;


            }
            a=a/10;
        }
        return false;


    }
}
