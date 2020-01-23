public abstract class Bird extends Animal implements CanFly{
    public Bird(String name)
    {
        super(name);
    }
    public void eat()
    {
        System.out.println("Gulp whole");
    }
    public void breadth()
    {
        System.out.println("breadth in, breadth out");
    }

      public void fly()
     {
         System.out.println(super.getName() + " flapping its wings");
     }
}
