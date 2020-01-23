public class Dimensions {
    private int width;
    private int height;
    private int depth;

    public Dimensions(int width, int height, int depth)
    {
        this.width=width;
        this.depth=depth;
        this.height=height;

    }

    public int getWidth()
    {
        return this.width;
    }
    private int getHeight()
    {
        return this.height;
    }
    private int getDepth()
    {
        return this.depth;
    }

}
