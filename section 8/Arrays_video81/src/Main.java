import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);   // this is for altername method using scanners
    public static void main(String[] args) {
//        int[] myIntArray = new int[10];
//        myIntArray[0]=10;
//        myIntArray[1]=20;
//        myIntArray[2]=30;
//        myIntArray[3]=40;
//        myIntArray[4]=50;
//        myIntArray[5]=60;
//        myIntArray[6]=70;
//        myIntArray[7]=80;
//        myIntArray[8]=90;
//        myIntArray[9]=100;
//        System.out.println(myIntArray[5]);

        // alternate method
//        int[] myIntArray = {1,2,3,4,5,6,7,8,9,10};
//        System.out.println(myIntArray[0]);
//        System.out.println(myIntArray[5]);
//        System.out.println(myIntArray[6]);

        //altername method
//        int[] myIntArray= new int[10];
//        for(int i=0;i<myIntArray.length;i++)
//        {
//            myIntArray[i]=i*10;
//        }
//        printArray(myIntArray);
//
//    }
//    public static void printArray(int[] array)
//    {
//        for(int i=0;i<array.length;i++)
//        {
//            System.out.println("Element " + i + " Value is " + array[i]);
//        }
//    }


        // alternate method using scanners
        int[] myIntArray=getIntegers(5);
        for (int i=0;i<myIntArray.length;i++)
        {
            System.out.println("element " + i + " value is " + myIntArray[i]);
        }

        System.out.println("The average of the sum of arrays is " +getAverage(myIntArray));


    }
    public static int[]  getIntegers(int number)
    {
        System.out.println("enter " + number + " integer values");
        int[] values = new int[number];
        for(int i=0;i<values.length;i++)
        {
            values[i]=scan.nextInt();
        }
        return values;
    }

    public static int getAverage(int[] avg)
    {
        int sum=0;
        int finalAverage=0;
        for(int i=0;i<avg.length;i++)
        {
            sum += avg[i];
            finalAverage=sum/avg.length;
        }
        return finalAverage;
    }


}
