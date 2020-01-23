
public class Main {
    public static void main(String[] args)
    {
//        Branch branch=new Branch("kolkata");
//        branch.addCustomer("jugal",100.00);
//        branch.addTransaction("jst",50);
//        branch.addTransaction("jugal",50);
//        branch.addCustomer("sekhar",100.00);

        Bank bank= new Bank("SBI");
        bank.addBranch("sealdah");
        bank.addBranch("sealdah");
        bank.addCustomer("sealdah","jugal",1000);
        bank.addCustomer("kolkata","jugal",1000);
        bank.addCustomerTransaction("sealdah","jugal",500);
        bank.addCustomerTransaction("sealdah","sekhar",500);
        bank.addCustomerTransaction("kolkata","sekhar",500);
    }
}
