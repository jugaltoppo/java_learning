import java.util.Scanner;
public class Main {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter the number of integers you want to enter");
        int numbers=scan.nextInt();
        int[] myaArray=readIntegers(numbers);
        System.out.println(findMin((myaArray)));
    }

    public static int[] readIntegers(int count)
    {
        int[] array=new int[count];
        for (int i=0;i<array.length;i++)
        {
            array[i]=scan.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array)
    {
        int min;
        min=Integer.MAX_VALUE;
        for(int i=0;i<array.length-1;i++)
        {
            if(array[i]<array[i+1])

                if(array[i]<min)
                {
                    min=array[i];
                }
        }
        return min;
    }
}
