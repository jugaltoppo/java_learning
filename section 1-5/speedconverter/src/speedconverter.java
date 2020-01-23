public class speedconverter
{
    public static void main(String[] args)
    {
        printConversion(1.25);
    }
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            double milesperhour=(kilometersPerHour/1.609);
            return Math.round(milesperhour);
        }
    }
    public static void printConversion(double kilometersPerHour)
    {
        if(kilometersPerHour<0)
        {
            System.out.println("Invalid Value");
        }
        else
        {
            toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h" );
        }
    }

}
