public class DecimalComparator
{
    public static void main(String args[])
    {
        boolean a=areEqualByThreeDecimalPlaces(3.176,3.175);
        System.out.println(a);
    }
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2)
    {
        double b=num1*1000;
        double c=num2*1000;
        int d=(int)b;
        int e=(int)c;
        if (d == e)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
