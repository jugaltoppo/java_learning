public class ComplexNumber
{
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary)
    {
        this.real= real;
        this.imaginary=imaginary;
    }
    public double getReal()
    {
        return this.real;
    }
    public double getImaginary()
    {
        return this.imaginary;
    }
    public void add(double real, double imaginary)
    {
        this.real= this.real+real;
        this.imaginary=this.imaginary+imaginary;
    }
    public void add(ComplexNumber abc)
    {
        add(abc.real,abc.imaginary);
    }
    public void subtract(double real, double imaginary)
    {
        this.real = this.real-real;
        this.imaginary= this.imaginary-imaginary;
    }
    public void subtract(ComplexNumber abc)
    {
        subtract(abc.real,abc.imaginary);
    }
}