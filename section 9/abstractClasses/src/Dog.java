public class Dog extends Animal{
    private String name;
    public Dog(String name)
    {
        super(name);
    }

    public void eat()
    {
        System.out.println("chew ");
    }
    public void breadth()
    {
        System.out.println("breadth in, breadth out");
    }
}
