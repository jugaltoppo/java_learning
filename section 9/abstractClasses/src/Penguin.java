public class Penguin extends Bird {
    private String name;
    public Penguin(String name,String classname)
    {
        super(name);
        this.name=classname;
    }
    public void fly()
    {
        super.fly();
        System.out.println(this.name + "(" + super.getName()+") " + " :Sorry i cant do that");
    }

}
