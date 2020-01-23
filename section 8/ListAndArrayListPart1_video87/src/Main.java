import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scan=new Scanner(System.in);
    private static int[] array = new int[10];
    public static void main(String[] args)
    {
        getInput();
        System.out.println(Arrays.toString(array));
        resizeAray(array);
        array[10]=12;
        array[11]=13;
        System.out.println(Arrays.toString(array));
    }
    public static void getInput()
    {
        for(int i=0;i<array.length;i++)
        {
            array[i]=scan.nextInt();
        }
    }
    public static void resizeAray(int[] arry)
    {
        int[] original=arry;
        array=new int[12];
        for(int i=0;i<original.length;i++)
        {
            array[i]=original[i];
        }
    }

}
