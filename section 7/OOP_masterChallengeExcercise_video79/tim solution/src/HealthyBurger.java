public class HealthyBurger extends Hamburger{
    private String addition5;
    private double addition5price;
    private String addition6;
    private double addition6price;
    public HealthyBurger( String meat, double price )
    {
        super("healthy", "Brown Rye",meat, price);
    }

    public void additionalitem5(String name, double price)
    {
        this.addition5=name;
        this.addition5price=price;
    }
    public void additionalitem6(String name, double price)
    {
        this.addition6=name;
        this.addition6price=price;
    }

    public double itemizeHealthyHamburger()
    {
        double healthyHamburger=itemize();
        if(this.addition5 != null)
        {
            healthyHamburger += this.addition5price;
            System.out.println(this.addition5 + " added with the price of " + this.addition5price);
        }
        if(this.addition6 != null)
        {
            healthyHamburger += this.addition6price;
            System.out.println(this.addition6 + " added with the price of " + this.addition6price);
        }
        return healthyHamburger;
    }
}
