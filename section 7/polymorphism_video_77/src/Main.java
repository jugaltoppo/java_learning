public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            Movie movie = randomNumber();
            System.out.println(movie.getName() + "\n" + movie.plot() + "\n\n");
        }
    }


    public static Movie randomNumber() {
        int randomnumber = (int) ((Math.random()*5)+1 );
        System.out.println("random number generated was " + randomnumber);
        switch (randomnumber)
        {
            case 1:
               return (new Jaws());
            case 2:
               return (new IndependenceDay());
            case 3:
                return (new StarWars());
            case 4:
                return (new MazeRunner());
            case 5:
                return (new Forgetful());
            default:

        }
        return null;
    }
}




    class Movie{
        private String name;
        public Movie(String name)
        {
            this.name=name;
        }

        public String plot()
        {
            return ("no plot");
        }
        public String getName()
        {
            return this.name;
        }
    }



    class Jaws extends Movie
    {
        public Jaws(){
            super("Jaws");
        }
        public String plot()
        {
            return ("Shark eats lots of people");
        }
    }

    class IndependenceDay extends Movie
    {
        public IndependenceDay()
        {
            super("Independence day");
        }
        public String plot()
        {
            return ("aliens try to take over earth");
        }
    }
    class StarWars extends Movie
    {
        public StarWars()
        {
            super("StarWars");
        }
        public String plot()
        {
            return ("Heroes fighting");
        }
    }
    class MazeRunner extends Movie{
        public MazeRunner()
        {
            super("Maze Runner");
        }
        public String plot()
        {
            return ("kids try to escape a maze");
        }
    }
    class Forgetful extends Movie{
        public Forgetful()
        {
            super("Forgetful");
        }
        //no plot
    }




