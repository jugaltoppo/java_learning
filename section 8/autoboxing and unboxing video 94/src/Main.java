import java.util.ArrayList;
class IntClass{
    private int myValue;
    public IntClass(int num)
    {
        this.myValue=num;
    }
    public IntClass()
    {

    }
    public void setMyValue(int newnum)
    {
        this.myValue=newnum;

    }
    public int getMyValue()
    {
        return this.myValue;
    }
}
public class Main {

    public static ArrayList<IntClass> myInt= new ArrayList<IntClass>();
    public static void main(String[] args)
    {
        myInt.add(new IntClass(58));

        ArrayList<Integer> myInteger = new ArrayList<Integer>();
        for(int i=0;i<=10;i++)
        {
            myInteger.add(Integer.valueOf(i));
        }
        for (int i=0;i<=10;i++)
        {
            System.out.println(i + " -> " + myInteger.get(i).intValue());
        }

        ArrayList<Double> myDouble = new ArrayList<Double>();
        for(double dbl=0.00;dbl<=10;dbl += 0.5)
        {
            myDouble.add(Double.valueOf(dbl));
        }
        for(int i=0;i<myDouble.size();i++)
        {
            System.out.println(i + " -> " + myDouble.get(i).doubleValue());
        }
    }


}
