public class methodOverloading
{
    public static void main(String args[])
    {
        calculatescore("jugal",500);
        int newscore=calculatescore("sekhar", 200);
        System.out.println("new score by sekhar is " + newscore);
        calculatescore(600);
        calculatescore();
    }
    public static int calculatescore(String playername, int score)
    {
        System.out.println("player " + playername + " score " + score + " points");
        return score*1000;
    }
    public static int calculatescore(int score) // we overload method by changing the number of parameters in a method
    {
        System.out.println("unnamed player scored" + score);
        return score*1000;
    }
    public static int calculatescore()
    {
        System.out.println("no player , no score");
        return 0;
    }
}
