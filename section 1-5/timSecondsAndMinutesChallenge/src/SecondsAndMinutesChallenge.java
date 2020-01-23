public class SecondsAndMinutesChallenge
{
    public static void main(String args[])
    {
//        String a=getDurationString(65,45); // my method
//        System.out.println(a);
        System.out.println(getDurationString(65,45)); // tims method

        //getDurationString(3945);  //you made this method wrong here correct one is below
        System.out.println(getDurationString(3945)); // you need to sout the return value here to give output in desired format

    }
    public static String getDurationString(int minutes, int seconds) // watch out the return type is string not int
    {
        if (minutes>=0 &&(seconds>=0 && seconds<=59))
        {
            int hour = minutes/60;
            int min = minutes%60;
            int sec = seconds;

            return hour + "h " + min + "m " + sec + "s"; //tim method  // see the return format
        }
        else
        {
            return "Invalid Parameters";
        }
    }
    public static String getDurationString(int seconds)
    {
        if(seconds>=0)
        {
            int sectomin= seconds/60;
            int remaining= seconds%60;
            // you made a sout statement here which is incorrect as the answer was 65 min 45 sec but you need in h/m/s format
            return getDurationString(sectomin,remaining); //here you pass the value to previous method
        }
        else
        {
           // System.out.println("invalid parameters"); //not necessary // mistake
            return "invalid parameters";
        }
    }

}
