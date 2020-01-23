public class Case {
    private String model;
    private String manufacturer;
    private String powersupply;
    private Dimensions dimensions;

    public Case(String model, String manufacturer, String powersupply,Dimensions dimensions)
    {
        this.model=model;
        this.manufacturer=manufacturer;
        this.powersupply=powersupply;
        this.dimensions=dimensions;
    }

    public void pressPowerButton()
    {
        System.out.println("Power button pressed");
    }

    public String getModel()
    {
        return this.model;
    }
    public String getManufacturer()
    {
        return this.manufacturer;
    }
    public String getPowersupply()
    {
        return this.powersupply;
    }
    public Dimensions getDimensions()
    {
        return this.dimensions;
    }


}
