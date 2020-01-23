public class VipCustomer {
    private String name;
    private long creditLimit;
    private String email;

    public VipCustomer()
    {
        this("default",0000,"default@default.com");
    }
    public VipCustomer(String name,long creditLimit)
    {
        this(name, creditLimit, "default@default.com");
    }
    public VipCustomer(String name, long creditLimit, String email)
    {
        this.name=name;
        this.creditLimit=creditLimit;
        this.email=email;
    }
    public String getName()
    {
        return this.name;
    }
    public long getCreditLimit()
    {
        return this.creditLimit;
    }
    public String getEmail()
    {
        return this.email;
    }
}
