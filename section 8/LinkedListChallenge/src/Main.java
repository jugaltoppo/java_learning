import java.util.*;

public class Main{
    public static void main(String[] args)
    {
        ArrayList<Album> myAlbum = new ArrayList<Album>();
        Album album1=new Album("First Album", "jugal");
        album1.addSongs("Just the way you lie",3.16);
        album1.addSongs("i want it that way",2.45);
        album1.addSongs("one love",3.01);
        myAlbum.add(album1);

        Album album2=new Album("Second Album","GameBoyJST");
        album2.addSongs("Starving",2.16);
        album2.addSongs("Far from home",3.22);
        album2.addSongs("Closer",2.00);
        myAlbum.add(album2);

        LinkedList<Song> myList = new LinkedList<Song>();
        myAlbum.get(0).addToPlaylist("one love",myList);
        myAlbum.get(0).addToPlaylist("i want it that way",myList);
        myAlbum.get(1).addToPlaylist("Starving",myList);

        myAlbum.get(1).addToPlaylist("closer",myList);

        play(myList);

    }

    private static void play(LinkedList<Song> playList)
    {
        System.out.println("==========================");
        ListIterator<Song> iterate = playList.listIterator();
        if(playList.isEmpty())
        {
            System.out.println("Playlist is empty");
        }
        {
//            if(iterate.hasNext())
            System.out.println("now Playing " + iterate.next());
        }
        printMenu();

        Scanner scanner = new Scanner(System.in);
        boolean check=true;
        boolean forward=true;
        while(check)
        {
            int choice=scanner.nextInt();
            scanner.nextLine();
            switch(choice)
            {
                case 0:
                    check=false;
                    break;
                case 1:
                    if(!forward)
                    {
                        if(iterate.hasNext())
                        {
                            iterate.next();
                        }
                        forward=true;
                    }
                    if(iterate.hasNext())
                    {
                        System.out.println("Now Playing " + iterate.next());
                    }
                    else
                    {
                        System.out.println("Reached the end of the playList");
                        forward=false;
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
                        System.out.println("Now Playing " + iterate.previous());
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
                            System.out.println("Now playing " + iterate.previous());
                            forward=false;
                        }
                        else
                        {
                            System.out.println("we are at the start of the playList");
                        }
                    }
                    else
                    {
                        if(iterate.hasNext())
                        {
                            System.out.println("now playing " + iterate.next());
                            forward = true;
                        }
                        else
                        {
                            System.out.println("we are at the end of the playlist");
                        }
                    }
                    break;
                case 4:
                    Iterator<Song> iteratelist = playList.iterator();
                    while(iteratelist.hasNext())
                    {
                        System.out.println(iteratelist.next());
                    }
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playList.size()>0)
                    {
                        iterate.remove();
                        if(iterate.hasNext())
                        {
                            System.out.println("Now playing " + iterate.next());
                        }
                        else if (iterate.hasPrevious())
                        {
                            System.out.println(("now playing " + iterate.previous()));
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
}