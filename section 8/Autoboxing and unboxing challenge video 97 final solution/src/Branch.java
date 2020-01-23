import java.util.ArrayList;
public class Branch {
    private String name;
    private ArrayList<Customer> customers;
    public Branch(String name)
    {
        this.name=name;
        this.customers=new ArrayList<Customer>();
    }

    public String getName()
    {
        return this.name;
    }
    public ArrayList<Customer> getCustomers()
    {
        return this.customers;
    }

    public boolean addCustomer(String name,double initialAmount)
    {
        Customer queryCustomer=findCustomer(name);
        if(queryCustomer==null)
        {
            customers.add(new Customer(name,initialAmount));
            System.out.println("new customer with nitial amount added succefully");
            return true;
        }
        else
        {
            System.out.println("error/customer already exist");
            return false;
        }
    }

    public boolean addTransaction(String existingCustomerName,double amount)
    {
        Customer existingCustomerQuery = findCustomer(existingCustomerName);
        if(existingCustomerQuery!=null)
        {
            existingCustomerQuery.addTransaction(amount);
            System.out.println("customer exist and amount added to transaction");
            return true;
        }
        else
        {
            System.out.println("error/customer not found ");
            return false;
        }
    }


    private Customer findCustomer(String name)
    {
        for(int i=0;i<customers.size();i++)
        {
            Customer searchCustomer = customers.get(i);
            if(searchCustomer.getName().equals(name))
            {
                return searchCustomer;
            }
            else
            {
                return null;
            }
        }
        return null;
    }
}
