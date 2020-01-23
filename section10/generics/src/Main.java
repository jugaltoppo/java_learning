import java.util.ArrayList;
public class Main {
    public static void main(String[] args)
    {
        ArrayList item = new ArrayList();
        //ArrayList<Integer> item = new ArrayList<>(); using generics
        item.add(1);
        item.add(2);
        item.add(3);
        item.add("jugal");     //error will only show at runtime not on compile time if not using generics
        item.add(4);
        item.add(5);

        printDouble(item);
    }

    private static void printDouble(ArrayList item)
   // private static void printDouble(ArrayList<Integer> item)   using generics

    {
        for(Object i : item)
        //for(int i : item)     can use int if using generics
        {
            System.out.println((int) i*2);
            //System.out.println( i*2);   type casting not needed if using generics
        }
    }
}
