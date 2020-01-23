import java.util.ArrayList;
public class GroceryList {
    private static ArrayList<String> groceryList= new ArrayList<String>();

    public static void addGroceryItem(String item)
    {
        groceryList.add(item);
    }

    public static void printGroceryItem()
    {
        System.out.println("you have " + groceryList.size() + "items in grocery list");
        for(int i=0;i<groceryList.size();i++)
        {
            System.out.println((i+1) + "." + groceryList.get(i));
        }
    }
    public static void modifyGroceryList(int posistion, String item)
    {
        groceryList.set(posistion,item);
        System.out.println("grocery item" + posistion+1 + "has been modified");
    }

    public static void removeGroceryItem(int position)
    {
        String theItem=groceryList.get(position);
        groceryList.remove(position);
    }
}
