public class digitSumChallenge
{
    public static void main(String args[])
    {
        System.out.println("sum of digits " + sumDigits(125));
        System.out.println("sum of digits " + sumDigits(-10));
        System.out.println("sum of digits " + sumDigits(9));
        System.out.println("sum of digits " + sumDigits(584584));

    }
    public static int sumDigits(int number)
    {
        int sum=0;
        if (number <10 || number<0)
        {
            return -1;
        }
        while(number>0) {
            int i = number % 10; // to extract the least significant digit
            sum += i;
            number /= 10; // to discard the least significant digit
            continue;
        }
        return sum;

    }
}
