public class Circle extends Shape
{
    private double raidus;
    public Circle(String theName, double theRadius)
    {
        super(theName);
        raidus = theRadius;
    }

    public double area()
    {
        return Math.PI * raidus * raidus;
    }
    public double perimeter() { return  Math.PI * 2 * raidus;}

}