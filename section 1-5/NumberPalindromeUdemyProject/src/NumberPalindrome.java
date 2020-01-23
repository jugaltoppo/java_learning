public class NumberPalindrome
{
    public static void main(String args[])
    {
        System.out.println(isPalindrome(11));
        System.out.println(isPalindrome(-11));
        System.out.println(isPalindrome(0));
        System.out.println(isPalindrome(1231));
    }
    public static boolean isPalindrome(int number)
    {
        int test=number;// we did this to retain the value of "number" **
        int num=0;
        while (test !=0)
        {

            int value=test%10;
            num = num*10+value;
            test= test/10;

        }
        if(num==number)//** we retained for this comparision
        {
            return true;
        }
        return false;
    }
}
