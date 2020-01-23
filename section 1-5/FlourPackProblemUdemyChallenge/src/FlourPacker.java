public class FlourPacker
{
    public static void main(String args[])
    {
        System.out.println(canPack(1,0,4));
        System.out.println(canPack(1,0,5));
        System.out.println(canPack(0,5,4));
        System.out.println(canPack(2,2,12));
        System.out.println(canPack(-3,2,12));
        System.out.println(canPack(2,1,5));
        System.out.println(canPack(1,0,4));
        System.out.println(canPack(5,3,24));


    }
    public static boolean canPack(int bigCount,int smallCount, int goal)
    {
        if(bigCount<0 || smallCount<0 || goal<0)
        {
            return false;
        }
        else
        {
            int bigvalue=bigCount*5;
            int smallvalue=smallCount*1;
            for (int i=0;i<=bigvalue;i=i+5)
            {
                if (i==goal)
                {
                    return true;
                }
                for(int j=0;j<=smallvalue;j++)
                {
                    if(i+j==goal)
                    {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
