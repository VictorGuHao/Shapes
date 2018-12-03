public abstract class Shape
{
    private String name;

    public Shape (String theName)
    {
        name = theName;
    }
    public abstract double area();
    public abstract double perimeter();
    public double semiperimeter(){return perimeter() / 2;}

    public String toString()
    {
        return name + ", " + "area = " + area() + ", perimeter = " + perimeter();
    }
}
