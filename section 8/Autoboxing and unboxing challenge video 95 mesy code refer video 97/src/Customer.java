import java.util.ArrayList;

public class Customer {
    private String name;
    private double initialAmount;     // my code
    private  ArrayList<Double> transaction;

    public Customer(String name, double initialAmount) {
        this.name = name;
        this.initialAmount = initialAmount;
        this.transaction = new ArrayList<Double>();
        addTransaction(initialAmount);
    }

    public String getName() {
        return this.name;
    }
    public ArrayList<Double> getTransaction()
    {
        return this.transaction;
    }

    public double getInitialAmount()  // my code
    {
        return this.initialAmount;
    }

    public void addTransaction(double amount) {
        this.transaction.add(amount);
    }

    public static Customer createCustomer(String name, double initialAmount) {
        return new Customer(name, initialAmount);
    }
}