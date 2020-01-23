public class Hamburger {
    private String name;
    private String breadRollType;
    private String meat;
    private double price;
    private String addition1;
    private double addition1price;
    private String addition2;
    private double addition2price;
    private String addition3;
    private double addition3price;
    private String addition4;
    private double addition4price;

    public Hamburger(String name, String breadRollType, String meat, double price)
    {
        this.name=name;
        this.breadRollType=breadRollType;
        this.meat=meat;
        this.price=price;
    }

    public void additionalitem1(String name, double price)
    {
        this.addition1=name;
        this.addition1price=price;
    }
    public void additionalitem2(String name, double price)
    {
        this.addition2=name;
        this.addition2price=price;
    }
    public void additionalitem3(String name, double price)
    {
        this.addition3=name;
        this.addition3price=price;
    }
    public void additionalitem4(String name, double price)
    {
        this.addition4=name;
        this.addition4price=price;
    }
    public double itemize()
    {
        System.out.println(this.name + " hamburger. with bread roll type " + this.breadRollType + " and meat " + this.meat +
                " at the base price of " + this.price);
        double hamburger=this.price;
        if(addition1 != null)
        {
            hamburger += this.addition1price;
            System.out.println("added " + this.addition1 + " for an extra " + this.addition1price);
        }
        if(addition2 != null)
        {
            hamburger += this.addition2price;
            System.out.println("added " + this.addition2 + " for an extra " + this.addition2price);
        }
        if(addition3 != null)
        {
            hamburger += this.addition3price;
            System.out.println("added " + this.addition3 + " for an extra " + this.addition3price);
        }
        if(addition4 != null)
        {
            hamburger += this.addition4price;
            System.out.println("added " + this.addition4 + " for an extra " + this.addition4price);
        }
        return hamburger;
    }

    public String getName() {
        return name;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public String getAddition1() {
        return addition1;
    }

    public double getAddition1price() {
        return addition1price;
    }

    public String getAddition2() {
        return addition2;
    }

    public double getAddition2price() {
        return addition2price;
    }

    public String getAddition3() {
        return addition3;
    }

    public double getAddition3price() {
        return addition3price;
    }

    public String getAddition4() {
        return addition4;
    }

    public double getAddition4price() {
        return addition4price;
    }
}
