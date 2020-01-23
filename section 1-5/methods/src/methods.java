public class methods {
    public static void calculator(boolean gameover, int score, int levelcompleted, int bonus) //this is a method created to calculate finalscore
    {
        int finalscore=score + (levelcompleted * bonus);
        finalscore += 2000;
        System.out.println("final score is " + finalscore);
    }
    public static void main(String Args[])
    {
        calculator (true,800,5,100);

        calculator(true,10000,8,200);
    }
}
