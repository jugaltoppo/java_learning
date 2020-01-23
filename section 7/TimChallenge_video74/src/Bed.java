public class Bed {
    private String style;
    private int pillow;
    private int height;
    private int sheet;
    private int quilt;

    public Bed(String style, int height, int pillow, int sheet, int quilt)
    {
        this.style=style;
        this.pillow=pillow;
        this.height=height;
        this.sheet=sheet;
        this.quilt=quilt;
    }
    public void make()
    {
        System.out.println("Bed -> making");
    }

    public String getStyle()
    {
        return this.style;
    }
    public int getPillow()
    {
        return this.pillow;
    }
    public int getHeight()
    {
        return this.height;
    }
    public int getSheet()
    {
        return this.sheet;
    }
    public int getQuilt()
    {
        return this.quilt;
    }
}
