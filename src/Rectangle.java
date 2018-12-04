public class Rectangle extends Quadrilateral
{
    public Rectangle(String n, double length, double width) {super(n, length, width, length, width);}

    public double area() {return getSide1() * getSide2();}
}
