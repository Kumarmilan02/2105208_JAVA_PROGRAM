/*Write a program in java to define a class Shape which has data member "area" and a member function showArea(). 
Derive two classes Circle and Rectangle from Shape class.
Add appropriate data members and member functions to calculate and display the area of Circle and Rectangle.*/


class Shape 
{
    double area;
    public void showArea() 
    {
        System.out.println("Area: " + area);
    }
}

class Circle extends Shape 
{
   	double radius;
    public Circle(double radius) 
    {
        this.radius = radius;
        area = 3.14 * radius * radius;
        //Math.PI * radius * radius;
    }
    public void showArea() 
    {
        System.out.println("Circle:");
        super.showArea();
    }
}

class Rectangle extends Shape 
{
    double length;
    double width;

    public Rectangle(double length, double width) 
    {
        this.length = length;
        this.width = width;
        area = length * width;
    }

    public void showArea() 
    {
        System.out.println("Rectangle:");
        super.showArea();
    }
}
class ShapeDemo 
{
    public static void main(String[] args) 
    {
        Circle circle = new Circle(5);
        circle.showArea();
        System.out.println("===========================");
        Rectangle rectangle = new Rectangle(10, 20);
        rectangle.showArea();
    }
}
