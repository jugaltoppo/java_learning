import java.util.Scanner;

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
    }
    public static void addItem()
    {
        System.out.println("please enter the item name");
        groceryList.addItem(scan.nextLine());
    }
    public static void removeItem()
    {
        System.out.println("enter the item number to be removed");
        groceryList.removeItem(scan.nextInt());
        scan.nextLine();
    }
    public static void modifyItem()
    {
        System.out.println("enter the item number you want to modify");
        int num= scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the name of the new item");
        String name = scan.nextLine();
        groceryList.modifyItem(num,name);

    }
    public static void searchItem()
    {
        System.out.println("enter the name of the item to be searched");
        groceryList.searchItem(scan.nextLine());
    }
    public static void printItem()
    {
        groceryList.printList();
    }
}