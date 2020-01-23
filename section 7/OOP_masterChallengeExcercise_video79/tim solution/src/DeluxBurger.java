public class DeluxBurger extends Hamburger{
    public String chips;
    public double chipsPrice;
    public String drinks;
    public double drinkPrice;
    public DeluxBurger(String meat, double price)
    {
        super("Delux Burger" , "White", meat, 200);
        super.additionalitem1("Drinks", 20);
        super.additionalitem2("Chips" , 10);

    }

    public void additionalitem1(String name, double price)
    {
        System.out.println("Not Allowed");
    }
    public void additionalitem2(String name, double price)
    {
        System.out.println("Not Alowwed");
    }
    public void additionalitem3(String name, double price)
    {
        System.out.println("Not Allowed");
    }
    public void additionalitem4(String name, double price)
    {
        System.out.println("Not Allowed");
    }
}
