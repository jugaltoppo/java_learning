import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League<T extends Team> implements Comparable<League<T>> {
    private String name;
    private int played=0;
    private int won=0;
    private int lost=0;
    private int tied=0;

    public League(String name)
    {
        this.name=name;
    }

    public String getName()
    {
        return  this.name;
    }

    List<T> teams = new ArrayList<>();

//    public void sortArray()             //here the problem lies
//    {
//        Collections.sort(teams);
//    }

    public boolean addTeam(T team)
    {
        if(teams.contains(team))
        {
            System.out.println("Team already on the list");
            return false;
        }
        else
        {
            teams.add(team);
            System.out.println(team.getName() + " added to the league");
            return true;
        }

    }

    public void matchResult(League<T> opponent,int ourScore, int theirScore)
    {
        String message;
        if(ourScore>theirScore)
        {
            won++;
            message=" won against ";
        }
        else if(ourScore<theirScore)
        {
            lost++;
            message= " lost to";
        }
        else
        {
            message = " tied with ";
            tied++;
        }
        played++;
        if(opponent!=null)
        {
            System.out.println(this.name + message + opponent.getName());
            opponent.matchResult(null,theirScore,ourScore);
        }
    }


    public int ranking()
    {
       return (won*2)+tied;
    }

    public int compareTo(League<T> team)
    {
        if(this.ranking()>team.ranking()) {
            return -1;
        }
        else if(this.ranking()<team.ranking())
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
