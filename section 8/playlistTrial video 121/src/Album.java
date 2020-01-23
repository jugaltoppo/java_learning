import java.util.ArrayList;
import java.util.LinkedList;
public class Album {
    private String name;
    private String artist;
    private ArrayList<Song>  songs;
    public Album(String name, String artist)
    {
        this.name=name;
        this.artist=artist;
        this.songs=new ArrayList<Song>();
    }


    public boolean addSong(String name, double duration)
    {
        if(findSong(name)==null)
        {
            songs.add(new Song(name,duration));
            return true;
        }
        System.out.println("error ading song " + name + " /already exist");
        return false;
    }

    private Song findSong(String name)
    {
        for(int i=0;i<songs.size();i++)
        {
            Song getSong=songs.get(i);
            if(getSong.getName().equals(name))
            {
                return getSong;
            }

        }
        return null;
    }

    public boolean addtoplaylist(String name,LinkedList<Song> playList)
    {
        Song getname=findSong(name);
        if(getname!=null)
        {
            playList.add(getname);
            return true;
        }
        System.out.println("Song not in album");
        return false;
    }
}
