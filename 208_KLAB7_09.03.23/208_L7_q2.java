/*Illustrate the execution of constructors in multi-level inheritance with three
Java classes – plate(length,width), box(length, width, height), wood box (length, width, height, thick)*/


class Plate 
{
    double length;
    double width;

    public Plate(double length, double width) 
    {
        System.out.println("Constructing a plate.");
        this.length = length;
        this.width = width;
    }

    public void display() 
    {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }
}

class Box extends Plate 
{
    double height;

    public Box(double length, double width, double height) 
    {
        super(length, width);
        System.out.println("Constructing a box.");
        this.height = height;
    }

    public void display() 
    {
        super.display();
        System.out.println("Height: " + height);
    }
}

class WoodBox extends Box 
{
    double thickness;

    public WoodBox(double length, double width, double height, double thickness) 
    {
        super(length, width, height);
        System.out.println("Constructing a wood box.");
        this.thickness = thickness;
    }

    public void display() 
    {
        super.display();
        System.out.println("Thickness: " + thickness);
    }
}

class Demo 
{
    public static void main(String[] args) 
    {
        WoodBox woodBox = new WoodBox(10, 20, 30, 5);
        woodBox.display();
    }
}
