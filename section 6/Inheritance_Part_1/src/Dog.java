public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String  coat;
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat )
    {
       super(name,1,1,size,weight);
       this.eyes=eyes;
       this.legs=legs;
       this.tail=tail;
       this.teeth=teeth;
       this.coat=coat;
    }

    private void chew()
    {
        System.out.println("chew() called");
    }

    public void eat()
    {
        System.out.println("dog.eat() called");
        chew();
        super.eat();
    }

    public int getEyes() {
        return eyes;
    }

    public int getLegs() {
        return legs;
    }

    public int getTail() {
        return tail;
    }

    public int getTeeth() {
        return teeth;
    }

    public String getCoat() {
        return coat;
    }
}
