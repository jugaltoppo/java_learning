public class Main {
    public static void main(String[] args)
    {

//        	    Player player = new Player();
//        player.name = "Tim";                                  // setting name field in player class directly
////        player.health = 20;                                 // setting health field in player class directly
//        player.weapon = "Sword";                              // setting weapon field in player class directly
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health =  " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;                                  // faulty use of code to increase health mid way
//        player.loseHealth(damage);
//        System.out.println("Remaining health =  " + player.healthRemaining());



        // the above code is main method without the use of encapsulation


        EnhancedPlayer player = new EnhancedPlayer("jugal", 200, "Machine gun");
        System.out.println("Initail player health " + player.getHealth());

        System.out.println("Player with  damage taken" );
        player.loseHealth(49);
        System.out.println("player current health: " + player.getHealth());
    }
}
