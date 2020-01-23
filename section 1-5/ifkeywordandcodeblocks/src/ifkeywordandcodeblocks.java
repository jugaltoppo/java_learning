public class ifkeywordandcodeblocks
{
    public static void main (String args[])
    {
        boolean gameover=true;
        int score=4000;
        int levelcompleted=5;
        int bonus=100;

        if (score <5000 && score>1000) {  //use of if keyword
            System.out.println(" the score is betweeen 1000 and 5000");
        }
        else if (score<1000)     //use of if else keyword
        {
            System.out.println("the score is less than 1000");
        }
        else
        {
            System.out.println("got here");
        }



        //codeblock

        if (gameover==true) {     //here variable finalscore can only be used within the scope of if block
            int finalscore = score + (levelcompleted * bonus);
            System.out.println("your final score was" + finalscore);
        }
        // finalscore = finalscore+50  //this is not acceptabe because finalscore is now outside the scope of if




        //challenge//

        boolean newgameover=true;
        int secondscore=10000;
        int secondlevelcompleted=8;
        int secondbonus=200;

        if (newgameover==true) {
            int finalscore = secondscore + (secondlevelcompleted * secondbonus);
            {
                System.out.println("your second final score is " + finalscore);
            }
        }

    }
}
