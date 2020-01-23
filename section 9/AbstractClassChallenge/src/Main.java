public class Main {
    public static void main(String[] args)
    {
        myLinkedList linklist = new myLinkedList(null);
        String name="9 8 7 0 6 5 1 2 3 4 ";
        String[] city = name.split(" ");

        linklist.traverse(linklist.getRoot());

        for(String s: city)
        {
            linklist.addItem(new Node(s));
        }
        linklist.traverse(linklist.getRoot());
        System.out.println("***************************");

        linklist.removeItem(new Node("5"));
        linklist.traverse(linklist.getRoot());

        System.out.println("***************************");

        linklist.removeItem(new Node("4"));
        linklist.traverse(linklist.getRoot());

        System.out.println("***************************");

        linklist.removeItem(new Node("3"));
        linklist.traverse(linklist.getRoot());

        System.out.println("***************************");

        linklist.removeItem(new Node("1"));
        linklist.traverse(linklist.getRoot());

        System.out.println("***************************");

        linklist.removeItem(new Node("2"));
        linklist.traverse(linklist.getRoot());

        System.out.println("***************************");

        linklist.removeItem(new Node("0"));
        linklist.traverse(linklist.getRoot());

        System.out.println("***************************");

        linklist.removeItem(new Node("9"));
        linklist.traverse(linklist.getRoot());

        System.out.println("***************************");

        linklist.removeItem(new Node("8"));
        linklist.traverse(linklist.getRoot());

        System.out.println("***************************");

        linklist.removeItem(new Node("7"));
        linklist.traverse(linklist.getRoot());

        System.out.println("***************************");

        linklist.removeItem(linklist.getRoot());
        linklist.traverse(linklist.getRoot());

        System.out.println("***************************");

        linklist.removeItem(linklist.getRoot());
        linklist.traverse(linklist.getRoot());
    }
}
