public class MAin {
    public static void main(String[] args)
    {
        BankAccount account = new BankAccount();//64654,100,"jugal toppo","jugal@email.com",974905311);
//        account.setAccountNumber(123456);
//        account.setBalance(0);
//        account.setCustomerName("Jugal Sekhar Toppo");
//        account.setEmail("jugalsekhartoppo@yahoo.com");
//        account.setPhoneNumber(9749053);
        System.out.println("customer name is " + account.getCustomerName() + " account number" + account.getAccountNumber() + " with current balance " + account.getBalence() + " Email" + account.getEmail() + " Phone NUmber" + account.getPhoneNumber());
        account.deposit(545);
        account.withdrawal(45);



        BankAccount newaccount= new BankAccount("jugal","jugal@email.com", 9434); // here only three argument passed
        System.out.println("customer name is " + newaccount.getCustomerName() + " account number" + newaccount.getAccountNumber() + " with current balance " + newaccount.getBalence() + " Email" + newaccount.getEmail() + " Phone NUmber" + newaccount.getPhoneNumber());

    }
}
