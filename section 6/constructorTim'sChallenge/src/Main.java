public class Main {
    public static void main(String[] args)
    {
        VipCustomer customer1 = new VipCustomer();
        System.out.println("Name: " + customer1.getName() + "\nCredit Limit " + customer1.getCreditLimit() + "\nEmail Address: " + customer1.getEmail() + "\n");

        VipCustomer customer2 = new VipCustomer("jugal", 1000, "jugalsekhartoppo@gmail.com");
        System.out.println("Name: "+ customer2.getName() + "\nCredit Limit:" + customer2.getCreditLimit() + "\nEmail Address:" + customer2.getEmail() + "\n");

        VipCustomer customer3 = new VipCustomer("sekhar", 2000 );
        System.out.println("Name:" + customer3.getName() + "\nCredit Limit:" + customer3.getCreditLimit() + "\nEmail Address:" + customer3.getEmail() + "\n");
    }

}
