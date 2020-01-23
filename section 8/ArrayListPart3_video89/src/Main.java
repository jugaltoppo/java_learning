import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    public static void main(String[] args) {

//        groceryList.addItem("cheese");
//        groceryList.addItem("bread");
//        groceryList.printList();
//        groceryList.removeItem(1);
//        groceryList.printList();
//        groceryList.modifyItem(1,"honey");
//        groceryList.printList();
//        groceryList.searchItem("honey");
        printInstructions();
        boolean check=true;
        while(check)
        {
            System.out.println("enter you selection");
            int choice=scan.nextInt();
            scan.nextLine();
            switch(choice)
            {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    addItem();
                    break;
                case 2:
                    removeItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    searchItem();
                    break;
                case 5:
                    printItem();
                    break;
                case 6:
                    check=false;
                    break;
                case 7:
                    processArrayList();
                    break;
                default:
                    System.out.println("please select the correct option");
            }
        }

    }
    public static void printInstructions()
    {
        System.out.println("press");
        System.out.println("\t 0 - to print instructions");
        System.out.println("\t 1 - to add item");
        System.out.println("\t 2 - to remove item");
        System.out.println("\t 3 - to modify item");
        System.out.println("\t 4 - to search item");
        System.out.println("\t 5 - to print Item list");
        System.out.println("\t 6 - to close the application");
        System.out.println("\t 7 - to process grocery list");
    }
    public static void addItem()
    {
        System.out.print("please enter the item name");
        groceryList.addItem(scan.nextLine());
    }
    public static void removeItem()
    {
        System.out.print("enter the item name to be removed");
        groceryList.removeItem(scan.nextLine());

    }
    public static void modifyItem()
    {
        System.out.print("enter the item name you want to modify");
        String oldname= scan.nextLine();
        System.out.print("Enter the name of the new item");
        String name = scan.nextLine();
        groceryList.modifyGroceryItem(oldname,name);

    }
    public static void searchItem()
    {
        System.out.print("enter the name of the item to be searched");
        groceryList.onFile(scan.nextLine());
    }
    public static void printItem()
    {
        groceryList.printList();
    }
    public static  void processArrayList()                          // to copy from one array to another
    {
        ArrayList<String> newArray = new ArrayList<String>();           //type one
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());      //type 2

        String[] myArray = new String[groceryList.getGroceryList().size()];     //type 3
        groceryList.getGroceryList().toArray(myArray);

        System.out.println(Arrays.toString(myArray));
    }
}