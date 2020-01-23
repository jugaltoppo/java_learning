import java.util.Scanner;
public class Main
{
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter the length of the array");
        int length=scan.nextInt();
        int[] myArray=getIntegers(length);
        printArray(myArray);


        System.out.println("sorted array");
        printArray(sortIntegers(myArray));

    }

    public static int[] getIntegers(int array)
    {
        System.out.println("enter the values to the array");
        int[] value= new int[array];
        for (int i=0;i<value.length;i++)
        {
            value[i]=scan.nextInt();
        }
        return value;
    }
    public static void printArray(int[] array)
    {
        for (int i=0;i<array.length;i++)
        {
            System.out.println("element " + i + " has a value " +array[i]);
        }
    }
    public static int[] sortIntegers(int[] array)
    {
        int temp;
        boolean flag=true;
        int[] newArray= new int[array.length];
        for(int i=0;i<array.length;i++)
        {
            newArray[i]=array[i];
        }
        while(flag) {
            flag=false;
            for (int i = 0; i < newArray.length-1; i++)
            {
                if (newArray[i] < newArray[i + 1])
                {
                    temp = newArray[i];
                    newArray[i] = newArray[i + 1];
                    newArray[i + 1] = temp;
                    flag=true;
                }
            }

        }
        return newArray;
    }
}
