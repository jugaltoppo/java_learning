public class Motherboard {
    private String model;
    private String manufacturer;
    private int ramslot;
    private int cardslot;
    private String bios;

    public Motherboard(String model, String manufacturer, int ramslot, int cardslot, String bios)
    {
        this.model=model;
        this.manufacturer=manufacturer;
        this.ramslot=ramslot;
        this.cardslot=cardslot;
        this.bios=bios;
    }

    public void loadProgram(String programName)
    {
        System.out.println("Program " + programName + "is now loading..");
    }

    public String getModel()
    {
        return this.model;
    }
    public String getmanufacturer()
    {
        return this.manufacturer;
    }
    public int getRamslot()
    {
        return this.ramslot;
    }
    public int getCardslot() {
        return this.cardslot;
    }
    public String getBios()
    {
        return this.bios;
    }

}
