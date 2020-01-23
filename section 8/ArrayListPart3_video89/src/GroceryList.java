import java.util.ArrayList;
public class GroceryList {
    private  ArrayList<String> groceryList = new ArrayList<String>();

    public ArrayList<String> getGroceryList()
    {
        return groceryList;
    }

    public  void addItem(String item) {
        groceryList.add(item);
    }

    public  void printList() {
        System.out.println("there are " + groceryList.size() + " items in the list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + "." + groceryList.get(i));
        }
    }
    public  void removeItem(String index)
    {
        int num = searchItem(index);
        if(num>=0) {
            groceryList.remove(num);
        }
    }
    public  void modifyGroceryItem(String oldname,String newname)
    {
        int position =  searchItem(oldname);
        if(position>=0) {
            modifyItem(position, newname);
        }
    }
    private  void modifyItem(int index,String string)
    {
        groceryList.set(index,string);
    }

    private  int searchItem(String item)
    {
        int position = groceryList.indexOf(item);
        return position;
    }

    public  void onFile(String name)
    {
        int position=searchItem(name);
        if(position>=0)
        {
            System.out.println("item fount");
        }
        else {
            System.out.println("not found");
        }
    }




}