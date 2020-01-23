import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        int myInteger=10;                       // myInteger and anotherInteger has a separate value assigned to each variable in different memory location
        int anotherInteger=myInteger;
        System.out.println("myInteger " + myInteger);
        System.out.println("anotherInteger " + anotherInteger);

        anotherInteger++;    //changing value of anotherInteger dose not change the value of myInteger
        System.out.println("myInteger after change " + myInteger);
        System.out.println("anotherInteger after change " + anotherInteger);

        int[] myArray=new int[5];//using new keyword creates a reference
        int[] anotherArray=myArray; // in reference anotherInteger has the reference to the same memory location
        System.out.println("myArray " + Arrays.toString(myArray));
        System.out.println("anotherArray " + Arrays.toString(anotherArray));


        anotherArray[0]=2;                                       //changing the value of anotherArray[0] changes the value of myArray[0] as both the
        System.out.println("myArray  after change 1 " + Arrays.toString(myArray));                   // variable has the reference to the same address
        System.out.println("anotherArray after change 1 " + Arrays.toString(anotherArray));

       // anotherArray=new int[] {5,4,3,2,1};  // doing this will create a new array for anotherArray and by calling the changeInteger() in next line will not reflect any changes in myArray
        changeInteger(anotherArray);    // called a method to change the value of anotherInteger[1]
        System.out.println("myArray after change 2 " + Arrays.toString(myArray));                  //changes can be seen both  in myArray and anotherArray
        System.out.println("anotherArray after change 2 " + Arrays.toString(anotherArray));        //as its a reference to the same address

    }
    public static int[] changeInteger(int[] array)
    {
        array[1]=3;

         array=new int[]{1,2,3,5};  // dereferenced and created a new array
                                    // myArray and anotherArray wont be able to see this change  because array had been dereferenced and a new array is created
    return array;
    }

    //run this code you will see why

//    public static int[] changeInteger(int[] array)
//    {
//
//        array=new int[]{1,2,3,5};  // no change will be reflected i.e. output: myArray after change 2 [2, 0, 0, 0, 0]
                                                                                //anotherArray after change 2 [2, 0, 0, 0, 0]
//        return array;
//    }

}
