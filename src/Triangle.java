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
    public boolean isIsosceles()
    {
        return a == b || a == c || b == c;
    }
    public boolean isRightTriangle()
    {
        return (a * a + b * b == c * c)||(a * a + c * c == b * b)||(b * b + c * c == a * a);
    }
    public boolean isValidTriangle()
    {
        return a > 0 && b > 0 && c > 0 && (a + b > c) && (a + c > b) && (b + c > a);
    }
}