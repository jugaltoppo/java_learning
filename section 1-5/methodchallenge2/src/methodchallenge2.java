public class methodchallenge2
{
    public static void displayhighscoreposition(String playername,int position)
    {
        System.out.println("player name is " + playername + " manage to get into position "  + position + " on the high score table");
    }
    public static int calculatehighscoreposition(int playerscore)
    {
        if(playerscore>=1000)
        {
            return 1;
        }
        else if (playerscore>=500)// && playerscore<1000)  // the second condition always is true
        {
            return 2;
        }
        else if(playerscore>=100)// && playerscore<500)  //the second condition is always true
        {
            return 3;
        }
        else {
            return 4;
        }

    }
    public static void main (String args[])
    {
        displayhighscoreposition("jugal",calculatehighscoreposition(1000));
        displayhighscoreposition("sekhar", calculatehighscoreposition(900));
        displayhighscoreposition("toppo",calculatehighscoreposition(400));
        int position=calculatehighscoreposition(50);
        displayhighscoreposition("java",position); //refer to section 4 lecture 29


    }
}
