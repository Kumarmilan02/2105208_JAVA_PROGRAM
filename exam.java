import java.util.Scanner;

class Test 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a shape (\n1=circle, \n2=square, \n3=triangle, \n4=rectangle):");
        int shape = scanner.nextInt();
        switch (shape) 
        {
            case 1:
                System.out.println("Enter the radius of the circle:");
                double radius = scanner.nextDouble();
                System.out.println("Area of the circle: " + meth(radius));
                System.out.println("Perimeter of the circle: " + meth(radius, shape));
                break;
            case 2:
                System.out.println("Enter the side of the square:");
                int side = scanner.nextInt();
                System.out.println("Area of the square: " + meth(side));
                System.out.println("Perimeter of the square: " + meth(side, shape));
                break;
            case 3:
                System.out.println("Enter the base ,height andside of the triangle:");
                double base = scanner.nextDouble();
                double height = scanner.nextDouble();
                double side1=scanner.nextDouble();
                System.out.println("Area of the triangle: " + meth(base, height,side1));
                System.out.println("Perimeter of the triangle: " + meth(base, height, shape));
                break;
            case 4:
                System.out.println("Enter the lengths and base of the rectangle: ");
                double length1 = scanner.nextDouble();
                double length2 = scanner.nextDouble();
                System.out.println("Area of the rectangle: " + meth(length1, length2));
                System.out.println("Perimeter of the rectangle: " + meth(length1, length2,shape));
                break;
            default:
                System.out.println("Invalid shape selected.");
                break;
            }
        }
        public static double meth(double radius) //area of circle
        {
            return 3.14 * radius * radius;
        }
        public static double meth(double radius,int shape)// perimeter of circle
        {
            return 2 * 3.14 * radius;
        }
        public static int meth(int side) //area of square
        {
            return side * side;
        }
        public static int meth(int side,int shape) //periemter of square
        {
            return 4 * side;
        }

        public static double meth(double base, double height,double side1) 
        {
            return  side1 * height;
        }

        public static double meth(double length1, double length2) 
        {
            return (length1 + length2);
        }
        
        public static int meth(int side,int shape) //area of square
        {
            return 4 * side;
        }

        public static double meth(double dimension1, double dimension2, int shape) 
        {
            switch (shape) 
            {
                case 1:
                    return 2 * 3.14 * dimension1;
                case 2:
                    double hypotenuse = Math.sqrt(dimension1 * dimension1 + dimension2 * dimension2);
                    return dimension1 + dimension2 + hypotenuse;
                case 3:
                    return 2 * (dimension1 + dimension2);
                default:
                    return 0;
        }
    }
}