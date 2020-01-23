import java.util.ArrayList;
public class Bank {
    private String name;
    private ArrayList<Branch> branch;
    public Bank(String name)
    {
        this.name=name;
        this.branch=new ArrayList<Branch>();
    }

    public void addBranch(String branchname)
    {
        if(findBranch(branchname)==null)
        {
            branch.add(new Branch(branchname));
            System.out.println("new branch successfully added");
        }
        else
        {
            System.out.println("error/branch already exist");
        }
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount)
    {
        Branch branch = findBranch(branchName);
        if(branch!=null)
        {
            System.out.println("customer with initial amount successfully added");
            return  branch.addCustomer(customerName,initialAmount);
        }
        else
        {
            System.out.println("error adding branch");
            return false;
        }
    }

    public boolean addCustomerTransaction(String branchANme,String customerName,double amount)
    {
        Branch branch=findBranch(branchANme);
        if(branch!=null)
        {
            System.out.println("existing customer transaction added");
            return branch.addTransaction(customerName,amount);
        }
        else
        {
            System.out.println("error adding customer's transaction/branch not found");
            return false;
        }
    }

    private Branch findBranch(String branchname)
    {
        for (int i=0;i<branch.size();i++)
        {
            Branch branchQuery = branch.get(i);
            if(branchQuery.getName().equals(branchname))
            {
                return branchQuery;
            }
        }
        return null;
    }

    public boolean listCustomer(String branchName, boolean transactionList)
    {
        Branch branch = findBranch(branchName);
        if(branch!=null)
        {
            for(int i=0;i<branch.getCustomers().size();i++)
            {
                System.out.println("Customer details for branch " + branch.getName());
                System.out.println("[" + (i+1) + "]" +  "customer " + branch.getCustomers().get(i).getName());
                if(transactionList)
                {
                    for (int j=0;j<branch.getCustomers().get(i).getTransactions().size();j++)  // dont forget the get(i) call to select transactions for individual customer
                    {                                                                           // or else it will be like searching transaction for all customers at the same time without using get(i)
                        System.out.println("\t\t"+"["+(j+1) + "[" + "trasactions " + branch.getCustomers().get(i).getTransactions().get(j));
                    }
                }
            }
            return true;
        }
        return false;
    }
}
