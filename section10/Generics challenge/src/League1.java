import java.util.ArrayList;
import java.util.Collections;
public class League1<T extends League> {
    private String name;
    public League1(String name)
    {
        this.name=name;
    }
    ArrayList<T> league = new ArrayList<>();

    public boolean addLeague(T team)
    {
        if(league.contains(team))
        {
            System.out.println("error");
            return false;
        }
        else
        {
            league.add(team);
            return true;
        }
    }

    public void showLeagueTable()
    {
        Collections.sort(league);
        for(T s:league)
        {
            System.out.println(s.getName() + " : " + s.ranking());
        }
    }
}
