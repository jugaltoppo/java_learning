public class forLoop
{
    public static void main(String args[])
    {
        for (int i=2;i<9;i++)
        {

            System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10000,i));
           //System.out.println("10,000 at " + i + "% interest = " + String.format("%.3f",calculateInterest(10000,i)));
            // the second one is done to have precision upto 2 decimals "String.format("%.2f"....
        }
        System.out.println("******************");
        for (int i=8;i>1;i--)
        {

            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000,i)));

        }
    }
    public static double calculateInterest( double amount, double interestrate)
    {
        double amt = amount*(interestrate/100);
        return amt;
    }
}
