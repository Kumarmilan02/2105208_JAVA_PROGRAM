/*A plastic manufacturer sells plastic in different shapes like 2D sheet and 3D
box. The cost of sheet is Rs 40/ per square ft. and the cost of box is Rs 60/ per
cubic ft. Implement it in Java to calculate the cost of plastic as per the dimensions given by the user where 3D inherits from 2D.*/


import java.util.Scanner;

class Shape2D 
{
    double length;
    double breadth;

    Shape2D(double length, double breadth) 
    {
        this.length = length;
        this.breadth = breadth;
    }

    double getArea() 
    {
        return length * breadth;
    }
}

// 3D shape class that inherits from 2D shape class
class Shape3D extends Shape2D 
{
    double height;

    public Shape3D(double length, double breadth, double height) 
    {
        super(length, breadth);
        this.height = height;
    }

    public double getVolume() 
    {
        return length * breadth * height;
    }
}

class PlasticCost 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Get shape dimensions from user
        System.out.print("Enter the length of the plastic shape: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the breadth of the plastic shape: ");
        double breadth = scanner.nextDouble();

        System.out.print("Enter the height of the plastic shape (0 if 2D shape): ");
        double height = scanner.nextDouble();

        scanner.close();

        // Calculate plastic cost
        double cost;
        if (height == 0) 
        {
            // 2D shape
            Shape2D shape2D = new Shape2D(length, breadth);
            cost = shape2D.getArea() * 40;
        }
        else 
        {
            // 3D shape
            Shape3D shape3D = new Shape3D(length, breadth, height);
            cost = shape3D.getVolume() * 60;
        }

        // Display plastic cost
        System.out.printf("The cost of the plastic shape is Rs %.2f\n", cost);
    }
}
