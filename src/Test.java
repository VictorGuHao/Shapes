import java.util.ArrayList;
import java.util.List;

public class Test
{
    public static void main(String[] arr)
    {
        Shape testCircle = new Circle("test circle", 5);
        Shape testRectangle = new Rectangle("test rectangle", 10, 5);
        Shape testTriangle = new Triangle("test triangle", 3, 4,5);
        List<Shape> shapes = new ArrayList<Shape>();
        shapes.add(testCircle);
        shapes.add(testRectangle);
        shapes.add(testTriangle);
        System.out.println(shapes);
        Shape.sortByAreaPerimeter(shapes);
        System.out.println(shapes);
    }
}
