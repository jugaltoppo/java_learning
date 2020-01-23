public abstract class Animal {
    private String name;
    public Animal(String name)
    {
        this.name=name;
    }

    public String getName()
    {
        return this.name;
    }

    abstract void eat();
    abstract void breadth();


}
