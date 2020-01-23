import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        ISaveable values = new Player("jugal",100,200);
        System.out.println(values.toString());
        ((Player) values).setHp(300);   ///notice the typecast here.....cuz he have to go from interface to the actual class

//        values.read(readValues());
        System.out.println(values.toString());

        saveObject(values);

        loadObject(values);
        System.out.println(values.toString());

        System.out.println("==============================");

        Monster monster = new Monster("toppo",600,600);
        System.out.println(monster.toString());
        monster.setHp(800);
        System.out.println(monster.toString());

        saveObject(monster);
        loadObject(monster);
        System.out.println(monster.toString());
    }

    public static List<String> readValues()
    {
        List<String> value = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        boolean check=true;
        while(check)
        {
            System.out.println("enter your choice");
            int choice=scanner.nextInt();
            scanner.nextLine();
            switch(choice)
            {
                case 0:
                    check=false;
                    break;
                case 1:
                    System.out.println("Enter the String");
                    String values=scanner.nextLine();
                    value.add(values);
                    break;
            }

        }
        return value;

    }

    public static void saveObject(ISaveable objectToSave)
    {
        for (int i=0;i<objectToSave.write().size();i++)
        {
            System.out.println("Saving " + objectToSave.write().get(i) + " to memory");
        }
    }

    public static void loadObject(ISaveable objectToLoad)
    {
        List<String> values = readValues();
        objectToLoad.read(values);
    }
}
