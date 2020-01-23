
public class Main {
    public static void main(String[] args)
    {
//        Branch branch=new Branch("kolkata");
//        branch.addCustomer("jugal",100.00);
//        branch.addTransaction("jst",50);
//        branch.addTransaction("jugal",50);
//        branch.addCustomer("sekhar",100.00);

//        Bank bank= new Bank("SBI");
//        bank.addBranch("sealdah");
//        bank.addBranch("sealdah");
//        bank.addCustomer("sealdah","jugal",1000);
//        bank.addCustomer("kolkata","jugal",1000);
//        bank.addCustomerTransaction("sealdah","jugal",500);
//        bank.addCustomerTransaction("sealdah","sekhar",500);
//        bank.addCustomerTransaction("kolkata","sekhar",500);
//        bank.addCustomer("sealdah","sekhar",1000);
//
//
//
//        bank.listCustomer("sealdah",true);

// tim code starts from here
        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide") ;

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Bob", 150.54);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

        bank.listCustomer("Adelaide", true);
        bank.listCustomer("Sydney", true);

        bank.addBranch("Melbourne");

   bank.addCustomer("Melbourne", "Brian", 5.53) ;

 bank.addBranch("Adelaide") ;

 bank.addCustomerTransaction("Adelaide", "Fergus", 52.33);

      bank.addCustomer("Adelaide", "Tim", 12.21);

    }
}
