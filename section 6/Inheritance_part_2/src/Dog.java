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

    public void walk()
    {
        System.out.println("Dog.walk() called");
        super.move(5); // super calls the .move() method of parent class
    }

    public void run()
    {
        System.out.println("Dog.run() called");
        move(10);  // this move() method doesnt called the method in parent class but finds the method in same class
    }
    public void move(int speed) // if this method is commented the move() method above calls the method in parent class
    {
        System.out.println("dog.move() called");
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
