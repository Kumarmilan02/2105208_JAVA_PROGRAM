import java.util.Scanner;
class Shape
{
    public int meth(int x)
    {
        return x*x;
    }
    public double meth(double x)
    {
        return 3.14*x*x;
    }
    public double meth(double l,double b,double w)
    {
        double sp=(l+b+w)/2;
        double area=Math.pow((sp*(sp-l)*(sp-b)*(sp-w)), 0.5);
        return area;
    }
    public double meth(double l,double b)
    {
        double area=l*b;
        return area;
    }
}
class Square extends Shape
{
    public int meth(int x)
    {
        int per=4*x;
        return per;
    }
}
class Circle extends Shape
{
   public double meth(double x)
   {
    return 2*3.14*x;
   }
}
class Triangle extends Shape
{
    public double meth(double l,double b,double w)
    {
        double per=l+b+w;
        return per;
    }
}
class Rectangle extends Shape
{
    public double meth(double l, double w)
    {
        return 2*(l+w);
    }
}
public class test{
    public static void main(String[] args){
        int ch;
        System.out.println("Enter Choice:");
        System.out.print("\n1.Sqaure\n2.Circle\n3.Triangle\n4.Rectangle");
        Scanner sc=new Scanner(System.in);
        ch=sc.nextInt();
        if(ch==0){
            System.out.println("INVALID.");
        }
        else if(ch==1){
            System.out.println("\n Enter Side:");
            int edge;
            edge=sc.nextInt();
            Shape s1=new Shape();
            int area=s1.meth(edge);
            s1=new Square();
            int per=s1.meth(edge);
            System.out.println("\n Area"+area+"\nPerimeter"+per);
        }
        else if(ch==2){
            System.out.println("\n Enter Radius:");
            double edge;
            edge=sc.nextDouble();
            Shape s2=new Shape();
            Double area=s2.meth(edge);
            s2=new Circle();
            Double per=s2.meth(edge);
            System.out.println("\n Area"+area+"\nPerimeter"+per);
        }
        else if(ch==3){
            System.out.println("\n Enter 3 Sides:");
            double t1,t2,t3;
            t1=sc.nextDouble();t2=sc.nextDouble();t3=sc.nextDouble();
            Shape s3=new Shape();
            double area=s3.meth(t1, t2,t3);
            s3=new Triangle();
            double per=s3.meth(t1,t2,t3);
            System.out.println("\n Area"+area+"\nPerimeter"+per);
        }
        else if(ch==4){
            System.out.println("\n Enter 2 Sides:");
            double t1,t2;
            t1=sc.nextDouble();t2=sc.nextDouble();
            Shape s4=new Shape();
            double area=s4.meth(t1,t2);
            s4=new Rectangle();
            double per=s4.meth(t1,t2);
            System.out.println("\n Area"+area+"\nPerimeter"+per);
        }
    }
}