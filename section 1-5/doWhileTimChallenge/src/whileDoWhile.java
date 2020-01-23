public class whileDoWhile
{
    public static void main (String args[])
    {
        int number = 4;
        int endnumber=20;
        int counts=0;
        int breakstatement=0;
        while (number <=endnumber)
        {
            number ++;
            if (isEvenNumber(number)!= true)
            {
                continue;
            }
            System.out.println("even number" + number);
            counts ++;
//            breakstatement ++;
//            if(breakstatement==5)
//            {
//                break;
//            }
            // tim method of breaking
            if(counts>=5)
            {
                break;
            }


        }
        System.out.println("number of even numbers found " + counts);
        System.out.println("***************");
        int count = 1;
        while (count != 6)
        {
            System.out.println("count value is " + count);
            count++;
        }
        // do while examole


//        count=7;
//        do
//        {
//            System.out.println("count value is " + count);
//            count++;
//        }
//        while(count <=6);
    }

    // tim challenge

    public static boolean isEvenNumber(int i)
    {
        while (i%2==0)
        {
            return true;
        }
        return false;
    }
}
