public class Main {
    public static void main(String[] args)
    {
        Car car = new Car(7,"simple car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Lamborghini lamborghini = new Lamborghini(8,"Gallardo");
        System.out.println(lamborghini.startEngine());
        System.out.println(lamborghini.accelerate());
        System.out.println(lamborghini.brake());

        Audi audi = new Audi();
        System.out.println(audi.startEngine());
        System.out.println(audi.accelerate());
        System.out.println(audi.brake());

        Nissan nissan = new Nissan(12,"Nissan GTR");
        System.out.println(nissan.accelerate());
        System.out.println(nissan.getName() +" with cylinders" + nissan.getCylinder());

    }
}

class Car{
    private boolean engine;
    private int cylinder;
    private int wheels;
    private String name;

    public Car( int cylinder, String name)
    {
        this.engine=true;
        this.cylinder=cylinder;
        this.wheels=5;
        this.name=name;
    }

    public String startEngine()
    {
        brake();
        return ("Engine starting");
    }

    public String accelerate()
    {
        startEngine();
        return ("Acclerating");
    }
    public String brake()
    {

        return ("Brakes Applied");
    }


    public int getCylinder()
    {
        return this.cylinder;
    }

    public String getName()
    {
        return this.name;
    }
}

class Lamborghini extends Car{
    public Lamborghini(int cylinder, String name)
    {
        super( cylinder,  name);
    }
    public String startEngine()
    {
        return "Lamborghini engine starting";
    }
    public String accelerate()
    {
        return "lambhorgini accelerating";
    }
    public String brake()
    {
        return "Lamborghini Breaks Applied";
    }
}

class Nissan extends Car
{
    public Nissan(int cylinder, String name)
    {
        super(cylinder, name);
    }
    public String startEngine()
    {
        System.out.println(brake());
        return "GTR engine starting";
    }
    public String accelerate()
    {
        System.out.println(startEngine());
        return "GTR accelerating";
    }
    public String brake()
    {
        return "GTR Breaks Applied";
    }
}
class Audi extends Car
{
    public Audi()
    {
        super(8,"R8");
    }
    public String startEngine()
    {
        return "Audi R8 engine starting";
    }
    public String accelerate()
    {
        return "Audi R8 accelerating";
    }
    public String brake()
    {
        return "Audi R8 Breaks Applied";
    }
}





//                Tim's code
//
//class Car {
//    private boolean engine;
//    private int cylinders;
//    private String name;
//    private int wheels;
//
//    public Car(int cylinders, String name) {
//        this.cylinders = cylinders;
//        this.name = name;
//        this.wheels = 4;
//        this.engine = true;
//    }
//
//    public int getCylinders() {
//        return cylinders;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String startEngine() {
//        return "Car -> startEngine()";
//    }
//
//    public String accelerate() {
//        return "Car -> accelerate()";
//    }
//
//    public String brake() {
//        return "Car -> brake()";
//    }
//}
//
//class Mitsubishi extends Car {
//
//    public Mitsubishi(int cylinders, String name) {
//        super(cylinders, name);
//    }
//
//    @Override
//    public String startEngine() {
//        return "Mitsubishi -> startEngine()";
//    }
//
//    @Override
//    public String accelerate() {
//        return "Mitsubishi -> accelerate()";
//    }
//
//    @Override
//    public String brake() {
//        return "Mitsubishi -> brake()";
//    }
//}
//
//class Holden extends Car {
//
//    public Holden(int cylinders, String name) {
//        super(cylinders, name);
//    }
//
//    @Override
//    public String startEngine() {
//        return getClass().getSimpleName() +  " -> startEngine()";
//    }
//
//    @Override
//    public String accelerate() {
//        return getClass().getSimpleName() +  " -> accelerate()";
//    }
//
//    @Override
//    public String brake() {
//        return getClass().getSimpleName() +  " -> brake()";
//    }
//}
//
//class Ford extends Car {
//
//    public Ford(int cylinders, String name) {
//        super(cylinders, name);
//    }
//
//    @Override
//    public String startEngine() {
//        return "Ford -> startEngine()";
//    }
//
//    @Override
//    public String accelerate() {
//        return "Ford -> accelerate()";
//    }
//
//    @Override
//    public String brake() {
//        return "Ford -> brake()";
//    }
//}
//
//public class Main {
//
//    public static void main(String[] args) {
//        // We are going to go back to the car analogy.
//        // Create a base class called Car
//        // It should have a few fields that would be appropriate for a generice car calss.
//        // engine, cylinders, wheels, etc.
//        // Constructor should initialize cylinders (number of) and name, and set wheels to 4
//        // and engine to true. Cylinders and names would be passed parameters.
//        //
//        // Create appropriate getters
//        //
//        // Create some methods like startEngine, accelerate, and brake
//        //
//        // show a message for each in the base class
//        // Now create 3 sub classes for your favorite vehicles.
//        // Override the appropriate methods to demonstrate polymorphism in use.
//        // put all classes in the one java file (this one).
//
//        Car car = new Car(8, "Base car");
//        System.out.println(car.startEngine());
//        System.out.println(car.accelerate());
//        System.out.println(car.brake());
//
//        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
//        System.out.println(mitsubishi.startEngine());
//        System.out.println(mitsubishi.accelerate());
//        System.out.println(mitsubishi.brake());
//
//        Ford ford = new Ford(6, "Ford Falcon");
//        System.out.println(ford.startEngine());
//        System.out.println(ford.accelerate());
//        System.out.println(ford.brake());
//
//        Holden holden = new Holden(6, "Holden Commodore");
//        System.out.println(holden.startEngine());
//        System.out.println(holden.accelerate());
//        System.out.println(holden.brake());
//    }
//
//
//}
