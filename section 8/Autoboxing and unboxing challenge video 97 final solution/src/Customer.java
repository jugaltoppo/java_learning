import java.util.ArrayList;
public class Customer {
    private String name;
    private ArrayList<Double> transaction;
    public Customer(String name,double initialAmount)
    {
        this.name=name;
        this.transaction=new ArrayList<Double>();
        addTransaction(initialAmount);
    }
    public String getName()
    {
        return this.name;
    }
    public ArrayList<Double> getTransactions()
    {
        return this.transaction;
    }
    public void addTransaction(double amount)
    {
        transaction.add(amount);
    }
}
