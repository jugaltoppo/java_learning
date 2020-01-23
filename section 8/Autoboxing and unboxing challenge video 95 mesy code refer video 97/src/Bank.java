import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> bankBranch;

    public Bank(String name) {
        this.name = name;
        this.bankBranch = new ArrayList<Branch>();
    }

    public boolean addBranch(String name) {
        if (findBranch(name) != null) {
            return false;
        } else {
            this.bankBranch.add(Branch.createBranch(name));
            return true;
        }
    }

    public boolean addCustomer(String branchName, String customerName, double intialAmount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomer(customerName,intialAmount);
        }
        return false;
    }
    public boolean addCustomerTransaction(String branchANme,String customerName,double amount)
    {
        Branch branch=findBranch(branchANme);
        if(branch!=null)
        {
            System.out.println("existing customer transaction added");
            return branch.addCustomerTransaction(customerName,amount);
        }
        else
        {
            System.out.println("error adding customer's transaction/branch not found");
            return false;
        }
    }

    private Branch findBranch(String name) {
        for (int i = 0; i < bankBranch.size(); i++) {
            Branch branch = bankBranch.get(i);
            if (branch.getName().equals(name)) {
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchname,boolean transaction)
    {
        Branch branch = findBranch(branchname);
        if(branch!= null)
        {
            ArrayList<Customer> branchCustomer = branch.getCustomer();
            for(int i=0;i<branchCustomer.size();i++)
            {
                Customer branchCustomers = branchCustomer.get(i);
                System.out.println("Branch name " + branch.getName() + "has a customer " +branchCustomers.getName());
                if(transaction)
                {
                   for(int j=0;j<branch.getCustomer().get(i).getTransaction().size();j++)
                   {
                       System.out.println("with transactions "+ branch.getCustomer().get(i).getTransaction().get(j));
                   }
                }
            }
            return true;
        }
        return false;
    }
}
