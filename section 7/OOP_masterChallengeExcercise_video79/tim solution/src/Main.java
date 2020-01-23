public class Main {
    public static void main(String[] args)
    {
//        Hamburger hamburger =  new Hamburger("Burger KIng", "white" , "steak" , 120);
////        hamburger.additionalitem1("tomato",10);
////        hamburger.additionalitem2("lettuce",20);
////        hamburger.additionalitem4("Sause" , 5);
////        System.out.println(hamburger.itemize());

//        HealthyBurger healthyburger =  new HealthyBurger("bacon",150);
//        healthyburger.additionalitem1("tomato",10);
//        healthyburger.additionalitem2("lettuce",20);
//        healthyburger.additionalitem4("Sause" , 5);
//        healthyburger.additionalitem6("pepper" , 5);
//
//        System.out.println(healthyburger.itemizeHealthyHamburger());
        DeluxBurger deluxburger =  new DeluxBurger("bacon",150);
        deluxburger.additionalitem1("tomato",10);
        deluxburger.additionalitem2("lettuce",20);
        deluxburger.additionalitem4("Sause" , 5);


//        System.out.println(Hamburger.itemize());
        System.out.println(deluxburger.itemize());
    }
}
