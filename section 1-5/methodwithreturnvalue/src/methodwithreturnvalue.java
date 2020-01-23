public class methodwithreturnvalue
{
    public static int calculations(boolean gameover, int score, int levelscompleted, int bonus)
    {
        if (gameover == true)
        {
            int finalscore = score + ( levelscompleted * bonus);
            finalscore += 2000;
            return finalscore;
        }
        else
        {
            return -1;
        }
    }

    public static void main (String args[])
    {
        int highscore=calculations (true , 800 , 5,100);
        System.out.println("the high score is " + highscore);

        int newhighscore= calculations(true, 10000,8,200);
        System.out.println("the new high score is " + newhighscore);
    }

}
