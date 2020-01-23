public class ParsingValuesFromString
{
    public static void main (String args[])
    {
        String numberAsString="2018";
        System.out.println("number as string is " + numberAsString);

        int number=Integer.parseInt(numberAsString);
        System.out.println("number is " + number);

        System.out.println("************");
        //performing some operation

        numberAsString += numberAsString;
        number += number;
        System.out.println("NumberAsString added with itself is " + numberAsString);
        System.out.println("number added to itself is " + number);

        //performing operation with double
        System.out.println("************");
        String newString="10.50";
        System.out.println("double number as string is " + newString);
        double newNumber=Double.parseDouble(newString);
        System.out.println("double number is " + newString);

        System.out.println("************");
        //operation on double
        newString += newString;
        System.out.println(newString);
        newNumber += newNumber;
        System.out.println(newNumber);

    }

}
