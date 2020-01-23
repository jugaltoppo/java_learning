public class Main {
    public static void main(String[] args)
    {
        Dog dog =  new Dog("pomenarian");
        dog.breadth();
        dog.eat();

        System.out.println("\n");

        Parrot parrot = new Parrot("becky","parrot");
        parrot.eat();;
        parrot.breadth();
        parrot.fly();

        System.out.println("\n");

        Penguin penguin = new Penguin ("David", "penguin");
        penguin.eat();
        penguin.breadth();
        penguin.fly();

//        Bird bird = new Bird("crow");   will only work if bird class in not abstract
//        bird.fly();
    }
}
