public class Main {
    public static void main(String[] args)
    {
        Rectangle rectangle = new Rectangle(5,5);
        System.out.println(rectangle.getArea());
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println(cuboid.getVolume());
        System.out.println(cuboid.getArea());
    }
}
