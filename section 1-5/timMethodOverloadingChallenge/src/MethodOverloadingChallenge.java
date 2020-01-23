public class MethodOverloadingChallenge
{
    double centi,cent;
    public static void main(String args[])
    {
        calcFeetAndInchesToCentimeters(5,7);
        calcFeetAndInchesToCentimeters(458);

    }
    public static double calcFeetAndInchesToCentimeters(double feet,double inches)
    {
        if (feet<=0 || (inches<=0 || inches>=12))
        {
            return -1;
        }
        else
        {
            double centimeters= feet * (12*2.54);
            centimeters += inches*2.54;
            System.out.println(feet + "feet and" + inches + " is " + centimeters + " centimeters" );
            return centimeters;
        }
    }
    public static double calcFeetAndInchesToCentimeters(double inches)
   {
        if (inches>=0)
        {
            int  feet = (int)inches/12;
            int remaining = (int) inches%12;
            System.out.println(inches + "inches is " + feet + " feet and " + remaining + " inches");
            return calcFeetAndInchesToCentimeters(feet , remaining);

        }
        else
        {
            return -1;
        }

    }
}
