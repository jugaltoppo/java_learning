import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<Album> albums = new ArrayList<Album>();
        Album album1= new Album("jugal's volume 1", "Jugal");
        album1.addSong("chura ke dil mera",2.33);
        album1.addSong("mere samne wali khidki me", 3.20);
        album1.addSong("raat shabnami", 3.40);
        album1.addSong("raat shabnami", 3.40);


        albums.add(album1);

        Album album2 = new Album("Jugal's volume 2","Sekhar");
        album2.addSong("Easier",2.15);
        album2.addSong("call you mine",2.56);
        album2.addSong("call you mine",2.56);
        album2.addSong("Halo",3.21);
        albums.add(album2);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addtoplaylist("wefwf",playList);
        albums.get(0).addtoplaylist("raat shabnami",playList);
        albums.get(1).addtoplaylist("Halo",playList);

        play(playList);
    }

    public static void play(LinkedList<Song> playlist)
    {
        ListIterator<Song> iterate = playlist.listIterator();
        if(playlist.isEmpty())
        {
            System.out.println("playList is empty");
        }else if(iterate.hasNext())
        {
            System.out.println("Now playing " + iterate.next());
        }
        printMenu();

        Scanner scanner=new Scanner(System.in);
        boolean check=true;
        boolean forward=true;
        while (check)
        {
            System.out.print("enter your choice");
            int choice=scanner.nextInt();
            scanner.nextLine();
            switch(choice)
            {
                case 0:
                    System.out.println("now quitting");
                    check=false;
                    break;
                case 1:
                    if(forward!=true)
                    {
                        if(iterate.hasNext())
                        {
                            iterate.next();
                        }
                        forward=true;
                    }
                    if(iterate.hasNext())
                    {
                        System.out.println("Now playing " + iterate.next().toString());
                    }
                    else
                    {
                        System.out.println("we have reached end of the list");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward)
                    {
                        if(iterate.hasPrevious())
                        {
                            iterate.previous();
                        }
                        forward=false;
                    }
                    if(iterate.hasPrevious())
                    {
                        System.out.println("Now Playing " + iterate.previous().toString());
                    }
                    else
                    {
                        System.out.println("reached the start of the playList");
                        forward=true;
                    }

                    break;
                case 3:
                    if(forward)
                    {
                        if(iterate.hasPrevious())
                        {
                            System.out.println("now playting " + iterate.previous().toString());
                        }
                        else
                        {
                            System.out.println("we are at the start of the list");
                        }
                    }
                    else
                    {
                        if(iterate.hasNext())
                        {
                            System.out.println("now playinmg " + iterate.next().toString());
                        }
                        else
                        {
                            System.out.println("we are at the end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playlist.size() >0) {
                        iterate.remove();
                        if(iterate.hasNext()) {
                            System.out.println("Now playing " + iterate.next());
                        } else if(iterate.hasPrevious()) {
                            System.out.println("Now playing " + iterate.previous());
                        }
                    }
                    break;
            }
        }
    }

    private static void printMenu()
    {
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list songs in the playlist\n" +
                "5 - print available actions.\n" +
                "6 - delete current song from playlist");
    }

    private static void printList(LinkedList<Song> playlist)
    {
        ListIterator<Song> iterate = playlist.listIterator();
        while (iterate.hasNext())
        {
            System.out.println(iterate.next());
        }
    }
}
