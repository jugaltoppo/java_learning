public class Car extends Vehicle {
    private int steeringWheel;

   public Car(int engine,int wheels,int gear,int speed, int door,int steeringWheel)
    {
        super(1,4,gear,speed,door);
        this.steeringWheel=steeringWheel;
    }
}
