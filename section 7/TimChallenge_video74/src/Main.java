public class Main {
    public static void main(String[] args)
    {
        Wall wall1 = new Wall("north");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall (" West");
        Wall wall4 = new Wall ("South");

        Ceiling ceiling = new Ceiling (12,55);

        Bed bed = new Bed("Modern", 3, 4, 2, 1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom  bedroom = new Bedroom(wall1, wall2, wall3,wall4,ceiling, bed, lamp);
        bedroom.makeBed();
        bedroom.getLamp().turnOn();

        System.out.println("Bedroom ceiling height:" + bedroom.getCeiling().getHeight() + "\nBedroom paint color :" +  bedroom.getCeiling().getPaintColor());
    }
}
