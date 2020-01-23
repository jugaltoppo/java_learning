public class HealthyBurger extends Hamburger {
    private String cabbage;
    private String sause;
    private int cabbageprice;
    private int sauseprice;
    public HealthyBurger(String name, String breadRollType, String meat)
    {
        super(name, breadRollType, meat);
        this.cabbage="cabbage";
        this.sause="sause";
        this.cabbageprice=5;
        this.sauseprice=2;
    }

    public String getCabbage() {
        return cabbage;
    }

    public String getSause() {
        return sause;
    }

    public int getCabbageprice() {
        return cabbageprice;
    }

    public int getSauseprice() {
        return sauseprice;
    }
}
