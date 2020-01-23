public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private long phoneNumber;

    public BankAccount()
    {
        this(0000,500,"default name","default email",0000); // constructor argument is left empty
        System.out.println("this is an empty constructor");
    }
    public BankAccount(int accountNumber, double balance, String customerName, String email,long phoneNumber) // all constructor argument is filled in main
    {
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.customerName=customerName;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }
    public BankAccount(String customerName, String email, int phoneNumber)
    {
        this(9999,100.55,customerName,email,phoneNumber); //account number and balance is default and customer name, email and phone number is pass as argument in constructor
    }

    public int getAccountNumber()
    {
        return this.accountNumber;
    }
    public double getBalence()
    {
        return this.balance;
    }
    public String getCustomerName()
    {
        return this.customerName;
    }
    public String  getEmail()
    {
        return this.email;
    }
    public long getPhoneNumber()
    {
        return this.phoneNumber;
    }
    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber=accountNumber;
    }
    public void setBalance(double balance)
    {
        this.balance=balance;
    }
    public void setCustomerName(String customerName)
    {
        this.customerName=customerName;
    }
    public void setEmail(String email)
    {
        this.email=email;
    }
    public void setPhoneNumber(long phoneNumber)
    {
        this.phoneNumber=phoneNumber;
    }
    public void deposit(double amount)
    {
        this.balance=balance+amount;
        System.out.println("Current balance is " + this.balance + " Deposited amount is " + amount);
    }
    public void withdrawal(double amount)
    {
        if(this.balance<amount)
        {
            System.out.println("Insufficient balance");
        }
        else
        {
            this.balance -= amount;
            System.out.println("Current balance is " + this.balance + " withdrew amount is " + amount);
        }
    }
}
