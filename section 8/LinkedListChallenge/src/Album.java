import java.util.ArrayList;
import java.util.LinkedList;
public class Album
{
    private String name;
    private String artist;
    private ArrayList<Song> songs;
    public Album(String name,String artist)
    {
        this.name=name;
        this.artist=artist;
        this.songs=new ArrayList<Song>();
    }

    public String getName()
    {
        return this.name;
    }
    public String getArtist()
    {
        return this.artist;
    }
    public ArrayList<Song> getSong()
    {
        return this.songs;
    }

    public boolean addSongs(String name,double duration)
    {
        if(findSong(name)==null)
        {
            songs.add(new Song(name,duration));
            System.out.println("Song added");
            return true;
        }
        else
        {
            System.out.println("Song already exist");
            return false;
        }
    }

    private Song findSong(String name)
    {
        for (Song checkSong:this.songs)
        {
            if(checkSong.getTitle().equals(name))
            {
                return checkSong;
            }

        }
        return null;
    }

    public boolean addToPlaylist(String name,LinkedList<Song> playList)
    {
        for(Song checkedSong: this.songs)
        {
           if(checkedSong.getTitle().equals(name))
           {
               playList.add(checkedSong);
               return true;
           }
        }
        System.out.println(name + " not present in the album");
        return false;

    }
}