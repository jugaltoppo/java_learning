public class Car
{
    private int door;
    private int wheels;
    private String model;

    public void setmodel(String model)
    {
        String valid = model.toLowerCase();
        if(valid.equals("carrera") || valid.equals("wagonr")) {
            this.model = model;
        }
        else
        {
            this.model="unknown";
        }
    }
    public String getmodel()
    {
        return this.model;
    }
}