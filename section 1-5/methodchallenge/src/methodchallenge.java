public class methodchallenge
{
    public static int calculations(boolean gameover, int score, int levelscompleted, int bonus) /// these is a method with parameters inside "()" brackets
    {
        if (gameover==true) // we are using method to return a a value hence we use "static int"
        {
            int finalscore = score + (levelscompleted * bonus);
            finalscore += 2000;
            System.out.println("your final score is" + finalscore);
            return finalscore;
        }
        else  // since we are returning a value to the main method we need to return for both condition met or not met, hence we use else that return -1
            {
                return -1;
            }
    }
    public static void main(String args[])
    {
        calculations(true,800,5,100);

        calculations(true,10000,8,200);
    }
}
