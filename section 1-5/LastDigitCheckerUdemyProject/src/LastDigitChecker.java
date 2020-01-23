public class lastdigitcheker {
    public static void main(String[] args)
    {
        System.out.println(hasSameLastDigit(99,0,999));
    }
    public static boolean isValid(int num)
    {
        if(num>=10 && num<=1000 )
        {
            return true;
        }
        return false;
    }
    public static boolean hasSameLastDigit(int num1, int num2, int num3)
    {
        int value1;
        int value2;
        int value3;
        if(isValid(num1) && isValid(num2) && isValid(num3) )
        {
            value1=num1%10;
            value2=num2%10;
            value3=num3%10;
            if (value1==value2 || value2==value3 || value3== value1)
            {
                return true;
            }
        }
        return false;
    }
}
