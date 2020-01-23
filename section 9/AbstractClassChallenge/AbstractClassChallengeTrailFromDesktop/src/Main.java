public class Main {
    public static void main(String[] args)
    {
        MyLinkedList myList = new MyLinkedList(null);
        String city="Delhi Mumbai Kolkata Chennai";
        String[] arr = city.split(" ");
        for(String a:arr)
        {
            myList.addItem(new Node(a));
        }

        myList.traverse(myList.getRoot());

        System.out.println("****************");
        myList.removeItem(new Node("Delhi"));
        myList.traverse(myList.getRoot());

        System.out.println("****************");
        myList.removeItem(new Node("Chennai"));
        myList.traverse(myList.getRoot());

        System.out.println("****************");
        myList.removeItem(new Node("Kolkata"));
        myList.traverse(myList.getRoot());

        System.out.println("****************");
        myList.removeItem(new Node("Mumbai"));
        myList.traverse(myList.getRoot());

        System.out.println("****************");
        myList.removeItem(myList.getRoot());
        myList.traverse(myList.getRoot());
    }
}
