import java.util.*;
public abstract class Shape implements Comparable<Shape>
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

    public int compareTo(Shape other)
    {
        if (this.area() < other.area())
            return -1;
        if (this.area() > other.area())
            return 1;
        if (this.perimeter() < other.perimeter())
            return -1;
        if (this.perimeter() > other.perimeter())
            return 1;
        return 0;
    }

    public static void sortByAreaPerimeter(List<Shape> shapes)
    {
        for(int i = 0; i < shapes.size() - 1; i++)
        {
            int lowNumPos = i;
            for (int j = i + 1; j < shapes.size(); j++)
            {
                if (shapes.get(j).compareTo(shapes.get(lowNumPos)) < 0)
                    lowNumPos = j;
            }
            shapes.set(i, shapes.set(lowNumPos, shapes.get(i)));
        }
    }
}
