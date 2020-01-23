import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customer;

    public Branch(String name) {
        this.name = name;
        this.customer = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomer() {
        return customer;
    }

    public static Branch createBranch(String name) {
        return new Branch(name);
    }

    public String getName() {
        return this.name;
    }

    public boolean addCustomer(String name, double initialTransaction)  // my code
    {
        if (findCustomer(name) != null) {
            System.out.println("Customer already exist");
            return false;
        } else {
            this.customer.add(Customer.createCustomer(name, initialTransaction));
            return true;
        }
    }

    public boolean addCustomerTransaction(String name, double amount)  // my code
    {
        Customer customer = findCustomer(name);
        if (customer != null) {
            customer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String name) {
        for (int i = 0; i < customer.size(); i++) {
            Customer searchCustomer = customer.get(i);
            if (searchCustomer.getName().equals(name)) {
                return searchCustomer;
            }

        }
        return null;
    }
}