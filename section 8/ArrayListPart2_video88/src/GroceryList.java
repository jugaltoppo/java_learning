import java.util.ArrayList;
public class GroceryList {
    private static ArrayList<String> groceryList = new ArrayList<String>();

    public static void addItem(String item) {
        groceryList.add(item);
    }

    public static void printList() {
        System.out.println("there are " + groceryList.size() + " items in the list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + "." + groceryList.get(i));
        }
    }
    public static void removeItem(int index)
    {
        groceryList.remove(index-1);
    }
    public static void modifyItem(int index,String string)
    {
        groceryList.set(index-1,string);
    }

    public static void searchItem(String item)
    {
        int position = groceryList.indexOf(item);
        if(position>=0 )
        {
            System.out.println("item found");
        }
        else
        {
            System.out.println("item not found");
        }
    }
}