/*(6.4) Write a program in Java to define a class Rectangle having data member: 
length and breadth; to calculate the area and perimeter of the rectangle. Use 
member functions to read, calculate and display.
*/

import java.util.Scanner;

class Rectangle 
{
    double length, breadth;
	void readDimensions() 
	{
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextDouble();
        System.out.print("Enter breadth: ");
        breadth = sc.nextDouble();
    }

    double calculateArea() 
    {
        return length * breadth;
    }

    double calculatePerimeter() 
    {
        return 2 * (length + breadth);
    }

    void display() 
    {
        System.out.println("Length = " + length);
        System.out.println("Breadth = " + breadth);
        System.out.println("Area = " + calculateArea());
        System.out.println("Perimeter = " + calculatePerimeter());
    }

    public static void main(String[] args) 
    {
        Rectangle rect = new Rectangle();
        rect.readDimensions();
        rect.display();
    }
}


