public class PlayingCat
{
    public static void main(String args[])
    {
        System.out.println(isCatPlaying(false,34));
    }
    public static boolean isCatPlaying(boolean summer,int temperature)
    {
        if (summer==true )
        {
            if (temperature<=45 && temperature>=25)
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
            if(temperature<=35 && temperature>=25)
            {
                return true;
            }
            else
            {
                return false;
            }
        }

    }
}
