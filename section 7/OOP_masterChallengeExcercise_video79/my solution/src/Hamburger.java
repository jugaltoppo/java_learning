public class Hamburger {
    private String breadRollType;
    private String meat;
    private int lettucePrice;
    private int tomatoPrice;
    private int carrotPrice;
    private int mayoPrice;
    private String lettuce;
    private String tomato;
    private String carrot;
    private String mayo;
    private String name;
    private int basePrice;

    public Hamburger(String name,String breadRollType, String meat)
    {
        this.name=name;
        this.breadRollType=breadRollType;
        this.meat=meat;
        this.basePrice=120;
        this.lettucePrice=10;
        this.tomatoPrice=20;
        this.carrotPrice=30;
        this.mayoPrice=40;
        this.lettuce="Lettuce";
        this.tomato="tomato";
        this.carrot="Carrot";
        this.mayo="Mayo";

    }


public int getBasePrice()
{
    return this.basePrice;
}

    public int getLettucePrice() {
        return lettucePrice;
    }

    public int getTomatoPrice() {
        return tomatoPrice;
    }

    public int getCarrotPrice() {
        return carrotPrice;
    }

    public int getMayoPrice() {
        return mayoPrice;
    }
}
