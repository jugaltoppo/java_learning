public class TeenNumberChecker
{
    public static void main(String args[])
    {
        boolean a = hasTeen(11,22,31);
        System.out.println(a);
    }
    public static boolean hasTeen(int num1, int num2, int num3 )
    {
        if ((num1>=13 && num1<=19) || (num2>=13 && num2<=19) || (num3>=13 && num3<=19))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
