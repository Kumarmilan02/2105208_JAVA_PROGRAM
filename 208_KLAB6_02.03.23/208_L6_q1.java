

/* (6.1)write a class file – box with three data members(length, width, height) and a method
volume() . Also implement the application class Demo where an object of the
box class is created with user entered dimensions and volume is printed.*/

import java.util.Scanner;
class Box {
	double length, width, height;

	Box(double l, double w, double h) {
		length = l;
		width = w;
		height = h;
	}
	double volume() 
	{
		return length * width * height;
	}
}

class Demo 
{
	public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter length: ");
        double length = scanner.nextDouble();
        
        System.out.print("Enter width: ");
        double width = scanner.nextDouble();
        
        System.out.print("Enter height: ");
        double height = scanner.nextDouble();
        
        Box box = new Box(length, width, height);
        double volume = box.volume();
        
        System.out.println("The volume of the box is " + volume);
    }
}
