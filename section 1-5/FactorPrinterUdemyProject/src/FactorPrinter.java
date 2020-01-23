public class FactorPrinter
{
    public static void main (String args[])
    {
        printFactors(6);
    }
    public static void printFactors(int number)
    {
        if(number<1)
        {
            System.out.println("Invalid Value");
        }
        int a=number;
        int count=1;
        while(count<=a)
        {
            int value=a%count;
            if (value==0)
                System.out.println(count);
            count++;

        }
    }
}
