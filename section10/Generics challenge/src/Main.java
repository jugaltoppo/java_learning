import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        IPL KKR = new IPL("KKR");
        IPL CSK = new IPL("CSK");

        ICCT20 India = new ICCT20("India");
        ICCT20 Pakistan = new ICCT20("Pakistan");

        UEFA realMadrid = new UEFA("Real Madrid");
        UEFA barcelona = new UEFA("Barcelona");

        League<IPL> team1 = new League<>("KKR");
        team1.addTeam(KKR);
        League<IPL> team2 = new League<>("CSK");
        team2.addTeam(CSK);

        League<ICCT20> team3 = new League<>("India");
        team3.addTeam(India);
        League<ICCT20> team5 = new League<>("Pakistan");
        team5.addTeam(Pakistan);

        League<UEFA> team4 = new League<>("Real Madrid");
        team4.addTeam(realMadrid);
        League<UEFA> team6 = new League<>("Barcelona");
        team6.addTeam(barcelona);


        //////////////////////////
        System.out.println("*****************************");

        team1.matchResult(team2,10,5);
        team3.matchResult(team5,100,0);
        team4.matchResult(team6,6,6);

        System.out.println("*****************************");

        System.out.println(team1.getName() + " : " + team1.ranking()
                 + "\n" + team2.getName() + " : " + team2.ranking()
                + "\n" + team3.getName() + " : " + team3.ranking()
                + "\n" + team5.getName() + " : " + team5.ranking()
                + "\n" + team4.getName() + " : " + team4.ranking()
                + "\n" + team6.getName() + " : " + team6.ranking());


        System.out.println("****************");

        League1<League<IPL>> game = new League1<>("IPL");
        game.addLeague(team1);
        game.addLeague(team2);
        game.showLeagueTable();

    }
}
