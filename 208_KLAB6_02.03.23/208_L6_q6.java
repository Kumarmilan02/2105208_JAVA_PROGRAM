/*(6.6)Write a program to calculate area according to user input, depending on
whether the user selects a circle, square, or triangle (Menu Driven).*/

import java.util.Scanner;
class Area 
{

    void area(double a) 
    {
        System.out.println("Circle Area : " + (3.14 * a * a));
    }
    void area(int a) 
    {
        System.out.println("Square Area : " + (a * a));
    }
    void area(double a,double b)
    {
        System.out.println("Triangle Area: "+ (0.5 * a * b));
    }
}
class L6_q3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Area ar = new Area();
        
        {
        System.out.println("Enter choice:");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Square");
        int choice = sc.nextInt();
        
        switch (choice) 
        {
            case 1:
                System.out.print("Enter radius: ");
                double radius = sc.nextDouble();
                ar.area(radius);
                break;
            case 2:
                System.out.print("Enter base: ");
                double base = sc.nextDouble();
                System.out.print("Enter height: ");
                double height = sc.nextDouble();
                ar.area(base, height);
                break;
            case 3:
                System.out.print("Enter side: ");
                int side = sc.nextInt();
                ar.area(choice, side);
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
        
    }
}
}

