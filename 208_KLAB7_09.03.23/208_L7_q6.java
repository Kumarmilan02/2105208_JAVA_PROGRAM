/*Write a program in java using inheritance to show how to call the base class
parameterized constructors from the derived class using super.*/


class Base 
{
    int num;
    Base(int num) 
    {
        this.num = num;
        System.out.println("Base class constructor called.");
    }
}

class Derived extends Base 
{
    Derived(int num) 
    {
        super(num);
        System.out.println("Derived class constructor called.");
    }

    void display() 
    {
        System.out.println("Value of num in base class is: " + num);
    }
}

class MainCons 
{
    public static void main(String[] args) 
    {
        Derived d = new Derived(10);
        d.display();
    }
}
