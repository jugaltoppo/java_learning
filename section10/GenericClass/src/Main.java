
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        BaseballPlayer jugal= new BaseballPlayer("Jugal");
        BaseballPlayer laguj= new BaseballPlayer("Laguj");

        SoccerPlayer sekhar = new SoccerPlayer("sekhar");
        SoccerPlayer rahkes = new SoccerPlayer("rahkes");

        FootballPlayer toppo = new FootballPlayer("toppo");
        FootballPlayer oppot = new FootballPlayer("oppot");

        Team<BaseballPlayer> swatCats =  new Team<>("Swat Cats");
        swatCats.addPlayer(jugal);
        Team<BaseballPlayer> Cats =  new Team<>("Cats");
        Cats.addPlayer(laguj);





        Team<SoccerPlayer> powerRanger =  new Team<>("Power Ranger");
        powerRanger.addPlayer(sekhar);
        Team<SoccerPlayer> Ranger =  new Team<>("Ranger");
        Ranger.addPlayer(rahkes);

        Team<FootballPlayer> pokemon =  new Team<>("Pokemon");
        pokemon.addPlayer(toppo);
        Team<FootballPlayer> cnpokemon =  new Team<>("cnPokemon");
        cnpokemon.addPlayer(oppot);

        System.out.println(swatCats.numPlayers());

        System.out.println("+++++++++++++++++++++++++");

        swatCats.matchResult(Cats,12,10);

        Ranger.matchResult(powerRanger,3,5);

        pokemon.matchResult(cnpokemon,5,5);

        System.out.println("*****************");

        System.out.println(swatCats.getName()+ " : " + swatCats.ranking());
        System.out.println(Cats.getName()+ " : " + Cats.ranking());
        System.out.println(powerRanger.getName()+ " : " + powerRanger.ranking());
        System.out.println(Ranger.getName()+ " : " + Ranger.ranking());
        System.out.println(pokemon.getName()+ " : " + pokemon.ranking());
        System.out.println(cnpokemon.getName()+ " : " + cnpokemon.ranking());

        System.out.println(swatCats.compareTo(Cats));
        System.out.println(Ranger.compareTo(powerRanger));
        System.out.println(pokemon.compareTo(cnpokemon));

        System.out.println("*******************");


        ArrayList<Team> team = new ArrayList<>(); // this is just a trail code
        team.add(swatCats);
        team.add(Cats);
        team.add(powerRanger);
        team.add(Ranger);
        team.add(pokemon);
        team.add(cnpokemon);
        Collections.sort( team);

    }
}
