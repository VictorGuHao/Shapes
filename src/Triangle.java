public class Triangle extends Shape
{
    private double a,b,c;

    public Triangle(String n, double s1, double s2, double s3)
    {
        super(n);
        a = s1;
        b = s2;
        c = s3;
    }

    public double perimeter(){return a + b + c;}

    public double area()
    {
        double s = semiperimeter();
        return Math.sqrt(s * (s-a) * (s-b) * (s-c));
    }
}