public class Parrot extends Bird {
    private String name;
    public Parrot(String name,String classname)
    {
        super(name);
        this.name=classname;
    }
    public void fly()
    {
        System.out.println(this.name + "(" + super.getName() + ")" + " :i can do that");
        super.fly();
    }
}
