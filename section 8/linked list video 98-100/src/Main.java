import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        LinkedList<String> placesToVisit = new LinkedList<String>();
//        placesToVisit.add("Sydnney");
//        placesToVisit.add("Melbourne");
//        placesToVisit.add("Brisbane");
//        placesToVisit.add("Perth");
//        placesToVisit.add("Camberra");
//        placesToVisit.add("Adelaide");
//        placesToVisit.add("darwin");
//
//        printList(placesToVisit);

        addInOrder(placesToVisit,"Sydnney");
        addInOrder(placesToVisit,"Melbourne");
        addInOrder(placesToVisit,"Brisbane");
        addInOrder(placesToVisit,"Perth");
        addInOrder(placesToVisit,"Camberra");
        addInOrder(placesToVisit,"Adelaide");
        addInOrder(placesToVisit,"darwin");

        printList(placesToVisit);

        addInOrder(placesToVisit,"darwin");

        printList(placesToVisit);


        visit(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList)
    {
        Iterator<String> i=linkedList.iterator();
        while(i.hasNext())
        {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("*************************");
    }

    private static void addInOrder(LinkedList<String> linkedList,String newCity)
    {
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while(stringListIterator.hasNext())
        {
            int comparison=stringListIterator.next().compareToIgnoreCase(newCity);
            if(comparison==0)
            {
                System.out.println(newCity + " is already in the list");
                return;
            }
            else if(comparison>0)
            {
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return;
            }
            else if(comparison<0)
            {

            }
        }
        stringListIterator.add(newCity);

    }

    private static void visit(LinkedList<String> cities)
    {
        Scanner scanner=new Scanner(System.in);
        ListIterator<String> listiterator = cities.listIterator();
        boolean set=true;
        boolean goingForward=true;
        if(cities.isEmpty())
        {
            System.out.println("no cities in the itenerary " );
            return;
        }
        else
        {
            System.out.println("now visiting " + listiterator.next());
        }
        while(set)
        {
            int choice=scanner.nextInt();
            switch(choice)
            {
                case 0:
                    set=false;
                    break;
                case 1:
                    if(goingForward!= true)
                    {
                        if(listiterator.hasNext())
                        {
                            listiterator.next();
                        }
                        goingForward=true;
                    }
                    if(listiterator.hasNext())
                    {
                        System.out.println("now visiting " + listiterator.next());
                    }
                    else
                    {
                        System.out.println("reached the end of itenarary");
                        goingForward=false;
                    }
                    break;
                case 2:
                    if(goingForward==true)
                    {
                        if(listiterator.hasPrevious())
                        {
                            listiterator.previous();
                        }
                        goingForward=false;
                    }
                    if(listiterator.hasPrevious())
                    {
                        System.out.println("now visiting " + listiterator.previous());
                    }
                    else
                    {
                        System.out.println("reached the start of the itenerary");
                        goingForward=true;
                    }
                    break;
            }
        }


    }
}