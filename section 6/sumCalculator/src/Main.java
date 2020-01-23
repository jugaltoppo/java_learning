public class Main {
    public static void main(String[] args)
    {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(20);
        calculator.setSecondNumber(10);
        System.out.println("ADD: " + calculator.getAdditionResult());
    }
}
