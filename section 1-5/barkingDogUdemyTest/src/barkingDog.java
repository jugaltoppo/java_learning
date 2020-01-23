public class barkingDog {
    public static void main (String args[])
    {
        boolean a=bark(false,4);
        System.out.println(a);
    }
    public static boolean bark(boolean barking, int hourOfDay)
    {
        if (hourOfDay  >=0 && hourOfDay<=24 && barking==true)
        {
            if (hourOfDay>22 || hourOfDay<8 && barking==true)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
}
