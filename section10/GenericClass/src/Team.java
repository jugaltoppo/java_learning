import java.util.ArrayList;
public class Team<T extends Player> implements Comparable<Team<T>> {

    private String name;
    public Team(String name)
    {
        this.name=name;
    }

    private int played=0;
    private int won=0;
    private int lost=0;
    private int tied = 0;

    public String getName()
    {
        return this.name;
    }

    private ArrayList<T> member = new ArrayList<>();

    public boolean addPlayer(T player)
    {
        if(member.contains(player))
        {
            System.out.println(player.getName() + " is already on this team");
            return false;
        }
        else
        {
            member.add(player);
            System.out.println(player.getName() + " placed for team " + name);
            return true;
        }
    }

    public int numPlayers()
    {
        return member.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore)
    {
        String message;
        if(ourScore>theirScore)
        {
            won++;
            message = "beat";

        }
        else if(ourScore==theirScore)
        {
            tied++;
            message = "tied with";
        }
        else
        {
            lost++;
            message = "lost to";
        }
        played++;
        if(opponent!=null)
        {
            System.out.println(this.name +" " + message +" " + opponent.getName());
            opponent.matchResult(null,theirScore,ourScore);
        }
    }

    public int ranking()
    {
        return (won*2)+tied;
    }


    public int compareTo(Team<T> team)
    {
        if(this.ranking()>team.ranking())
        {
            return 1;
        }
        else if(this.ranking()<team.ranking())
        {
            return -1;
        }
        else{
            return 0;
        }
    }
}
