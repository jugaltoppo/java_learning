public class DeluxBurger extends Hamburger {
    private int chipsprice;
    private int drinksprice;
    private String chips;
    private String drinks;

    public DeluxBurger(String name, String breadRollType, String meat)
    {
        super(name, breadRollType, meat);
        this.chipsprice=10;
        this.drinksprice=20;
        this.chips="Chips";
        this.drinks="Drinks";
    }

    public int getChipsprice() {
        return chipsprice;
    }

    public int getDrinksprice() {
        return drinksprice;
    }

    public String getChips() {
        return chips;
    }

    public String getDrinks() {
        return drinks;
    }
}
