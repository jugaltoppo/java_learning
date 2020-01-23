public class switchStatement
{
    public static void main (String args[])
    {
//        int value =3;
//        if (value==1) /// but in if-else statement we can test multiple values of different varaiable
//        {
//            System.out.println("value was 1");
//        }
//        else if(value ==2 ) //we can use something like "if (boolean cat== true) then * few codes
//        {
//            System.out.println("value was 2");
//        }
//        else
//        {
//            System.out.println("value was neither 1 or 2");
//        }
        // equivalent switch code
        // switch parameters can only have byte,short,char or int

        int switchvalue=6;  // we use switch case when we have to test multiple values of the "same" variable
        switch(switchvalue)
        {
            case 1:
                System.out.println("value was 1");
                break;
            case 2:
                System.out.println("value was 2");
                break;
            case 3: case 4: case 5:
            System.out.println("value was 3 , or 4, or 5");
            System.out.println("actually it was " + switchvalue);
            break;
            default :
                System.out.println("it was neither 1,2,3,4,5");
                break;
        }
        // tim's challenge
        char value='f';
        switch(value)
        {
            case 'a':
                System.out.println("char is a");
                break;
            case 'b' :
                System.out.println("char is b");
                break;
            case 'c':  // we can also do case 'c' : case 'd' : case 'e':
                System.out.println("char is c");
                break;
            case 'd':
                System.out.println("char is d");
                break;
            case 'e':
                System.out.println("char is e");
                break;
            default:
                System.out.println("not found");
                break;
        }

        // another one
        String stringValue="jAnUary";
        switch (stringValue.toLowerCase()) // ".toLowerCase" is a method of class string that converts all the string to lower case and tests the value
        {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not Found");
                break;
        }



    }
}
