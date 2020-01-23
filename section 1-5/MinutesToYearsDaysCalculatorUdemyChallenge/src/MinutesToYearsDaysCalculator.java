public class MinutesToYearsDaysCalculator
{
    public static final String ERROR_MESSAGE="Invalid Value";
    public static void main(String args[])
    {
        printYearsAndDays(561600);
    }
    public static void printYearsAndDays(long minutes)
    {
        if (minutes<0)
        {
            System.out.println(ERROR_MESSAGE);
        }
        else {
            long year = (((minutes / 365) / 24) / 60);
            long days = (minutes / 1440) % 365;
            System.out.println(minutes + " min = " + year + " y and " + days + " d");
        }
    }
}
